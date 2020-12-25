package com.sabot.manage_sys.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FamilyMember {

    private Integer memberId;
    private String memberName;
    private String memberSex;
    private Integer memberAge;
    private Integer familyId;

}
