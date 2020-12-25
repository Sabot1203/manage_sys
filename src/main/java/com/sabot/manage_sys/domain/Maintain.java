package com.sabot.manage_sys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maintain {

    private Integer maintainId;
    private String content;
    private Integer ownerId;
    private Date registrationTime;
    private Integer cost;
    private Date finishedTime;
}
