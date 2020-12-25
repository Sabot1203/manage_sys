package com.sabot.manage_sys.controller;

import com.sabot.manage_sys.config.ResultResponse;
import com.sabot.manage_sys.dao.MaintainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintainController {

    @Autowired
    private MaintainDao maintainDao;

    @GetMapping("/findMaintainList")
    public ResultResponse findMaintains(){
        return ResultResponse.success(maintainDao.findMaintainList());
    }

    @PostMapping("/deleteMaintainById")
    public ResultResponse deleteMaintainById(Integer maintainId){
        if(maintainDao.deleteMaintainById(maintainId) == 1){
            return ResultResponse.success("删除成功");
        }else{
            return ResultResponse.error("删除失败");
        }
    }

}
