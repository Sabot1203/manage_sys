package com.sabot.manage_sys.dao;

import com.sabot.manage_sys.domain.Maintain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MaintainDao {

    List<Maintain> findMaintainList();

    int deleteMaintainById(Integer maintainId);
}
