package com.sabot.manage_sys.controller;

import com.sabot.manage_sys.config.ResultResponse;
import com.sabot.manage_sys.dao.PayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    private PayDao payDao;

    @GetMapping("/findPayList")
    public ResultResponse findPayList(){
        return ResultResponse.success(payDao.findPayList());
    }


    @PostMapping("/deletePayById")
    public ResultResponse deletePayById(Integer payId){
        if(payDao.deletePayById(payId) == 1){
            return ResultResponse.success("删除成功");
        }else{
            return ResultResponse.error("删除失败");
        }
    }
}
