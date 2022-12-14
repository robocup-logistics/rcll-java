package com.rcll.refbox;

import com.rcll.domain.TeamColor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamConfig {
    private String cryptoKey;
    private String name;
}
