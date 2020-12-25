package com.sabot.manage_sys.controller;

import com.sabot.manage_sys.config.ResultResponse;
import com.sabot.manage_sys.dao.PaymentItemDao;
import com.sabot.manage_sys.domain.PaymentItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentItemController {

    @Autowired
    private PaymentItemDao paymentItemDao;

    @GetMapping("/findPaymentItemList")
    public ResultResponse findPaymentItemList(){
        return ResultResponse.success(paymentItemDao.findPaymentItemList());
    }

    @PostMapping("/deletePaymentItemByName")
    public ResultResponse deletePaymentItemByName(String paymentItem){
        if(paymentItemDao.deletePaymentItemByName(paymentItem) == 1){
            return ResultResponse.success("删除成功");
        }else{
            return ResultResponse.error("删除失败");
        }
    }

    @PostMapping("/updatePaymentItem")
    public ResultResponse updatePaymentItem(PaymentItem paymentItem){
        if(paymentItemDao.updatePaymentItem(paymentItem) == 1){
            return ResultResponse.success("更新成功");
        }else{
            return ResultResponse.error("更新失败");
        }
    }

    @PostMapping("/insertPaymentItem")
    public ResultResponse insertPaymentItem(PaymentItem paymentItem){
        if(paymentItemDao.insertPaymentItem(paymentItem) == 1){
            return ResultResponse.success("添加成功");
        }else{
            return ResultResponse.error("添加失败");
        }
    }




}
