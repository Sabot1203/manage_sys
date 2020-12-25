package com.sabot.manage_sys.dao;

import com.sabot.manage_sys.domain.Pay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayDao {

    List<Pay> findPayList();

    int deletePayById(Integer payId);
}
