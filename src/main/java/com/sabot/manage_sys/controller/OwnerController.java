package com.sabot.manage_sys.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sabot.manage_sys.config.ResultResponse;
import com.sabot.manage_sys.dao.OwnerDao;

import com.sabot.manage_sys.domain.Owner;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OwnerController {

    @Autowired
    private OwnerDao ownerDao;

    @GetMapping("/owners")
    public ResultResponse Owners(@RequestParam(value="pageNo",defaultValue="1")int pageNo, @RequestParam(value="pageSize",defaultValue="10")int pageSize){

        PageHelper.startPage(pageNo,pageSize);
        List<Owner> allOrderPresentList = ownerDao.findOwners();
        return ResultResponse.success(new PageInfo<>(allOrderPresentList));
    }

    @GetMapping("/ownersbyname")
    public ResultResponse OwnersByName( String name){
        return ResultResponse.success(ownerDao.findOwnerByName(name));
    }

    @PostMapping("/addowner")
    public ResultResponse addOwner( Owner owner){
        ownerDao.insertOwner(owner);
        if (owner != null){
            return ResultResponse.success();
        }else {
            return ResultResponse.error("插入失败,不知道为啥，别问我");
        }
    }

    @DeleteMapping("/deleteowner")
    public ResultResponse deleteOwner( Integer ownerId){
        if(ownerDao.deleteOwner(ownerId) != 0){
            return ResultResponse.success();
        }else{
            return ResultResponse.error("删除失败");
        }

    }

    @PostMapping("/updateowner")
    public ResultResponse updateOwner( Owner owner){
        if(ownerDao.updateOwner(owner) != 0){
            return ResultResponse.success();
        }else{
            return ResultResponse.error("修改失败");
        }
    }




}
