package com.sabot.manage_sys.dao;

import com.sabot.manage_sys.domain.House;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HouseDao {

    List<House> findHouseList();

    House findHouseById(Integer id);

    int updateHouseById(House house);
}
