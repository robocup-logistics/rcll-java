package com.rcll.robot;

import com.google.protobuf.GeneratedMessageV3;
import com.rcll.domain.MachineName;
import com.rcll.domain.MachineSide;
import com.rcll.domain.RobotBeacon;
import com.rcll.domain.Peer;
import com.rcll.protobuf_lib.RobotConnections;
import com.rcll.protobuf_lib.RobotMessageRegister;
import lombok.NonNull;
import lombok.extern.apachecommons.CommonsLog;
import org.robocup_logistics.llsf_msgs.*;

@CommonsLog
public class RobotClient {

    protected boolean robotsStopped;

    protected final RobotTaskCreator robotTaskCreator;
    protected final RobotConnections robotConnections;

    public RobotClient(RobotTaskCreator robotTaskCreator,
                       RobotConnections robotConnections) {
        this.robotTaskCreator = robotTaskCreator;
        this.robotConnections = robotConnections;
        RobotMessageRegister.getInstance().add_message(BeaconSignalProtos.BeaconSignal.class);
        RobotMessageRegister.getInstance().add_message(AgentTasksProtos.AgentTask.class);
        this.robotsStopped = false;
    }

    public RobotClient(RobotTaskCreator robotTaskCreator,
                       int robotConnectionTimeout) {
        this(robotTaskCreator, new RobotConnections(robotConnectionTimeout));
    }

    public RobotClient(int robotConnectionTimeout) {
        this(new RobotTaskCreator(), robotConnectionTimeout);
    }

    public boolean isRobotsStopped() {
        return this.robotsStopped;
    }

    public void cancelOnAll() {
        this.robotConnections.getRobots().stream().map(Peer::getId)
                .forEach(this::cancelTask);
    }
    public void cancelTask(long robotId) {
        log.info("Canceling current task of robot: " + robotId);
        AgentTasksProtos.AgentTask prsTask = robotTaskCreator.createCancelTask((long) robotId);
        sendPrsTaskToRobot(prsTask);
    }

    public void sendDummyTaskToRobot(@NonNull Long robotId,
                                     @NonNull String machine,
                                     MachineSide side) {
        AgentTasksProtos.AgentTask prsTask = robotTaskCreator.createDummyTask(robotId,
                machine,
                side);
        sendPrsTaskToRobot(prsTask);
    }

    public void sendDeliverTaskToRobot(@NonNull Long robotId,
                                       @NonNull Long taskId,
                                       @NonNull String machine,
                                       @NonNull MachineSide side,
                                       Integer machineCount) {
        AgentTasksProtos.AgentTask deliverPrsTask = robotTaskCreator.createDeliverWorkPieceTask(
                robotId,
                taskId.intValue(),
                machine,
                side,
                convertSideToShelfSlide(side, machineCount));
        sendPrsTaskToRobot(deliverPrsTask);
    }

    public void sendWaitingTaskToRobot(@NonNull Long robotId,
                                       @NonNull String zone) {
        AgentTasksProtos.AgentTask prsTask = robotTaskCreator.createWaitingTask(robotId, zone);
        sendPrsTaskToRobot(prsTask);
    }

    public void sendGetTaskToRobot(@NonNull Long robotId,
                                   @NonNull Long taskId,
                                   @NonNull String machine,
                                   MachineSide side,
                                   Integer machineCount) {
        AgentTasksProtos.AgentTask getPrsTask = robotTaskCreator.createGetWorkPieceTask(
                robotId,
                taskId.intValue(),
                machine,
                side,
                convertSideToShelfSlide(side, machineCount));
        sendPrsTaskToRobot(getPrsTask);
    }

    private String convertSideToShelfSlide(MachineSide side, Integer materialCount) {
        switch (side) {
            case Input:
                return "input";
            case Output:
                return "output";
            case Shelf:
                return "shelf" + (materialCount);
            case Slide:
                return "slide";
            default:
                throw new IllegalArgumentException("Invalid machineSide: " + side);
        }
    }

    public void stopAllRobots() {
        this.robotsStopped = true;
        robotConnections.getclientId().forEach(this::stopRobot);
    }

    public void startAllRobots() {
        this.robotsStopped = false;
        robotConnections.getclientId().forEach(this::startRobot);
    }

    private void startRobot(Long robotId) {
        sendPrsTaskToRobot(robotTaskCreator.createStopTask(robotId, false));
    }

    private void stopRobot(Long robotId) {
        sendPrsTaskToRobot(robotTaskCreator.createStopTask(robotId, true));
    }

    public <T extends GeneratedMessageV3> void sendToRobot(long robot_id, @NonNull T msg) {
        robotConnections.send_to_robot(robot_id, msg);
    }

    public void sendPrsTaskToRobot(AgentTasksProtos.AgentTask task) {
        log.info("Sending Task: " + task.getTaskId() + " to robot: " + task.getRobotId() + " - " + task.toString());
        try {
            robotConnections.getRobot(task.getRobotId()).setTimeLastTaskAssignment(System.currentTimeMillis());
            this.sendToRobot(task.getRobotId(), task);
        } catch (Exception e) {
            log.warn("robot not found, retrying after 0.3 seconds");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            sendPrsTaskToRobot(task);
        }
    }

    public void sendBufferCap(Long robotId, Long taskId, MachineName machine, Integer shelf) {
        AgentTasksProtos.AgentTask getPrsTask = robotTaskCreator.createBufferCapTask(
                robotId,
                taskId.intValue(),
                machine,
                shelf);
        sendPrsTaskToRobot(getPrsTask);
    }

    public void sendMoveTask(Long robotId, Long taskId, MachineName machineName, MachineSide side) {
        AgentTasksProtos.AgentTask getPrsTask = robotTaskCreator.createMoveToMachineTask(robotId,
                taskId.intValue(), machineName, side);
        sendPrsTaskToRobot(getPrsTask);
    }

    public void sendMoveToZoneTask(Long robotId, Long taskId, String zone) {
        AgentTasksProtos.AgentTask getPrsTask = robotTaskCreator.createMoveToWaypointTask(robotId, taskId.intValue(), zone);
        sendPrsTaskToRobot(getPrsTask);
    }

    public Integer getRobotCount() {
        return this.robotConnections.getRobots().size();
    }

    public RobotBeacon getBeaconForRobot(Long robotId) {
        return this.robotConnections.getBeaconForRobot(robotId);
    }
}

