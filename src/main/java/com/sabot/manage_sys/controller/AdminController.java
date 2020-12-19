package com.sabot.manage_sys.controller;

import com.sabot.manage_sys.config.ResultResponse;
import com.sabot.manage_sys.dao.AdminDao;
import com.sabot.manage_sys.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {

    @Autowired
    private AdminDao adminDao;

    @PostMapping("/login")
    public ResultResponse login(Admin userAdmin){

        Admin admin = adminDao.findByUserName(userAdmin.getUserName());
        if (admin != null && admin.getPsd().equals(userAdmin.getPsd()) ){
            return ResultResponse.success();
        }
        return ResultResponse.error("账号或密码错误");
    }
}
