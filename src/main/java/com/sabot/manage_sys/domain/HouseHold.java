package com.sabot.manage_sys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseHold {

    private Integer familyId;
    private String leader;
    private Integer memberShip;

    private List<FamilyMember> members;

}
