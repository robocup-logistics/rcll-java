package com.rcll.robot;

import com.rcll.domain.MachineName;
import com.rcll.domain.MachineSide;
import lombok.NonNull;
import org.robocup_logistics.llsf_msgs.AgentTasksProtos;
import org.robocup_logistics.llsf_msgs.TeamProtos;

import java.util.concurrent.atomic.AtomicInteger;

public class RobotTaskCreator {

    private final AtomicInteger uniqueTaskId;

    public RobotTaskCreator() {
        this.uniqueTaskId = new AtomicInteger(100000); //to prevent potential overlapping with other task IDs
    }

    public AgentTasksProtos.AgentTask createWaitingTask(@NonNull Long robotId,
                                                        @NonNull String waitingZoneName) {
        AgentTasksProtos.Move moveToWayPointTask = AgentTasksProtos.Move.newBuilder()
                .setWaypoint(waitingZoneName + "_waiting")
                .build();
        return AgentTasksProtos.AgentTask.newBuilder()
                .setTaskId(uniqueTaskId.getAndIncrement())
                .setTeamColor(TeamProtos.Team.CYAN) //TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setMove(moveToWayPointTask).build();
    }

    public AgentTasksProtos.AgentTask createMoveToWaypointTask(@NonNull Long robotId,
                                                               @NonNull Integer taskId,
                                                               @NonNull String waypoint) {
        AgentTasksProtos.Move moveToWayPointTask = AgentTasksProtos.Move.newBuilder()
                .setWaypoint(waypoint)
                .build();

        return AgentTasksProtos.AgentTask.newBuilder()
                .setTaskId(taskId)
                .setTeamColor(TeamProtos.Team.CYAN) //TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setMove(moveToWayPointTask).build();
    }

    public AgentTasksProtos.AgentTask createMoveToMachineTask(@NonNull Long robotId,
                                                              @NonNull Integer taskId,
                                                              @NonNull MachineName machine,
                                                              @NonNull MachineSide side) {

        return this.createMoveToWaypointTask(robotId, taskId, machine.getRawMachineName() + side.toString().toLowerCase() + "_move_base");
    }

    public AgentTasksProtos.AgentTask createMoveToMachineTask(@NonNull Long robotId,
                                                              @NonNull MachineName machine,
                                                              @NonNull MachineSide side) {

        return this.createMoveToMachineTask(robotId, uniqueTaskId.getAndIncrement(), machine, side);
    }

    public AgentTasksProtos.AgentTask createDummyTask(@NonNull Long robotId,
                                                      @NonNull String machine,
                                                      MachineSide side) {
        AgentTasksProtos.Move moveToWayPointTask = AgentTasksProtos.Move.newBuilder()
                .setWaypoint(machine + side.toString().toLowerCase() + "_exploration")
                .build();

        return AgentTasksProtos.AgentTask.newBuilder()
                .setTaskId(new Long(System.currentTimeMillis()).intValue())
                .setTeamColor(TeamProtos.Team.CYAN) //TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setMove(moveToWayPointTask).build();

    }

    public AgentTasksProtos.AgentTask createExplorationTask(@NonNull Long robotId,
                                                            String machineId,
                                                            String waypoint,
                                                            boolean rotate) {
        AgentTasksProtos.ExploreWaypoint exploreTask = AgentTasksProtos.ExploreWaypoint.newBuilder()
                .setMachineId(machineId)
                .setWaypoint(waypoint)
                //todo check why this was removed!!
                //.setRotate(rotate).build();
                .setMachinePoint("input").build();

        return AgentTasksProtos.AgentTask.newBuilder()
                .setTaskId(uniqueTaskId.getAndIncrement())
                .setTeamColor(TeamProtos.Team.CYAN) //TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setExploreMachine(exploreTask).build();
    }

    public AgentTasksProtos.AgentTask createReportAllMachinesTask(@NonNull Long robotId) {
        /*
        AgentTasksProtos.ReportAllSeenMachines reportAllMachinesTask = AgentTasksProtos.ReportAllSeenMachines.newBuilder()
                .setReport(true).build();

        return AgentTasksProtos.GripsMidlevelTasks.newBuilder()
                .setTaskId(0)
                .setTeamColor(getTeamColor())
                .setRobotId(robotId.intValue())
                .setReportAllSeenMachines(reportAllMachinesTask).build();
         */
        throw new RuntimeException("Not supported task!");
    }

    public AgentTasksProtos.AgentTask createCancelTask(@NonNull Long robotId) {
        return AgentTasksProtos.AgentTask.newBuilder()
                .setTaskId(uniqueTaskId.getAndIncrement())
                .setTeamColor(TeamProtos.Team.CYAN) //TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setCancelTask(true).build();
    }


    public AgentTasksProtos.AgentTask createStopTask(@NonNull Long robotId,
                                                     boolean stop) {
        return AgentTasksProtos.AgentTask.newBuilder()
                .setTaskId(0)
                .setRobotId(robotId.intValue())
                //.setStopRobot(stop) //todo add stop in proto msgs!
                .build();
    }

    public AgentTasksProtos.AgentTask createGetWorkPieceTask(@NonNull Long robotId,
                                                             @NonNull Integer taskId,
                                                             @NonNull String machine,
                                                             MachineSide side,
                                                             String shelfslide) {
        if (shelfslide != null) {
            return createGetWorkPieceTaskNew(robotId, taskId, machine, shelfslide);
        } else {
            String providingType = convertSideToprovidingType(side);
            return createGetWorkPieceTaskNew(robotId, taskId, machine, providingType);
        }
    }
    //todo refactor and replace magic String constants with ENUMs
    public AgentTasksProtos.AgentTask createGetWorkPieceTask(@NonNull Long robotId,
                                                             @NonNull String machine,
                                                             MachineSide side,
                                                             String shelfslide) {
        return this.createGetWorkPieceTask(robotId, uniqueTaskId.getAndIncrement(), machine, side, shelfslide);
    }

    public AgentTasksProtos.AgentTask createGetWorkPieceTaskNew(@NonNull Long robotId,
                                                                @NonNull Integer taskId,
                                                                @NonNull String machine,
                                                                @NonNull String machinePoint) {
        AgentTasksProtos.Retrieve getWorkPieceTask = AgentTasksProtos.Retrieve.newBuilder()
                .setMachineId(machine)
                .setMachinePoint(machinePoint)
                .build();
        return AgentTasksProtos.AgentTask.newBuilder()
                .setRetrieve(getWorkPieceTask)
                .setTeamColor(TeamProtos.Team.CYAN)//TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setTaskId(taskId).build();
    }

    //todo refactor and replace magic String constants with ENUMs
    public AgentTasksProtos.AgentTask createDeliverWorkPieceTask(@NonNull Long robotId,
                                                                 @NonNull Integer taskId,
                                                                 @NonNull String machine,
                                                                 MachineSide side,
                                                                 String shelfslide) {
        if (shelfslide != null) {
            return createDeliverWorkPieceTaskNew(robotId, machine, taskId, shelfslide);
        } else {
            String providingType = convertSideToprovidingType(side);
            return createDeliverWorkPieceTaskNew(robotId, machine, taskId, providingType);
        }
    }

    public AgentTasksProtos.AgentTask createDeliverWorkPieceTaskNew(@NonNull Long robotId,
                                                                    @NonNull String machine,
                                                                    @NonNull Integer taskId,
                                                                    @NonNull String machinePoint) {
        AgentTasksProtos.Deliver deliverWorkPieceTask = AgentTasksProtos.Deliver.newBuilder()
                .setMachineId(machine)
                .setMachinePoint(machinePoint)
                .build();
        return AgentTasksProtos.AgentTask.newBuilder()
                .setDeliver(deliverWorkPieceTask)
                .setTeamColor(TeamProtos.Team.CYAN)//TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setTaskId(taskId).build();
    }


    public AgentTasksProtos.AgentTask createBufferCapTask(@NonNull Long robotId, @NonNull Integer taskId,
                                                          MachineName machineName, Integer shelf) {
        AgentTasksProtos.BufferStation bufferCapTask = AgentTasksProtos.BufferStation.newBuilder()
                .setMachineId(machineName.getRawMachineName())
                .setShelfNumber(shelf)
                .build();
        return AgentTasksProtos.AgentTask.newBuilder()
                .setBuffer(bufferCapTask)
                .setTeamColor(TeamProtos.Team.CYAN)//TODO WHY DO WE NEED TEAM COLOR!!
                .setRobotId(robotId.intValue())
                .setTaskId(taskId).build();
    }
    public AgentTasksProtos.AgentTask createBufferCapTask(@NonNull Long robotId,
                                                          MachineName machineName, Integer shelf) {
        return this.createBufferCapTask(robotId, uniqueTaskId.getAndIncrement(), machineName, shelf);
    }

    //todo check with jakob!
    private String convertSideToprovidingType(MachineSide side) {
        switch (side) {
            case Output:
                return "output";
            case Input:
                return "input";
            default:
                throw new IllegalArgumentException("MachineSide cannot be parsed: " + side);
        }
    }


}
