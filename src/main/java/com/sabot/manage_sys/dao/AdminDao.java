package com.sabot.manage_sys.dao;


import com.sabot.manage_sys.domain.Admin;
import org.apache.ibatis.annotations.Mapper;


/**
 * @description: 懂得都得
 */
@Mapper
public interface AdminDao{

    Admin findByUserName(String userName);

    Admin insertAdmin(Admin admin);

    void updateAdmin(Admin admin);
}
