package com.sabot.manage_sys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {


    private Integer ownerId;

    private String name;

    private String phone;

    private Integer houseId;

    private Integer familyId;

}
