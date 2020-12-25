package com.sabot.manage_sys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {

    private Integer houseId;
    private Integer room;
    private Integer building;
    private Integer floor;
    private Integer area;
    private String houseType;
    private String Message;

}
