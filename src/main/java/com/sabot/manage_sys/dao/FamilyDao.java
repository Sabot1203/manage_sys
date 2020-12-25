package com.sabot.manage_sys.dao;

import com.sabot.manage_sys.domain.HouseHold;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FamilyDao {

    HouseHold findFamilyById(Integer familyId);
}
