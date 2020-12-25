package com.sabot.manage_sys.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sabot.manage_sys.config.ResultResponse;
import com.sabot.manage_sys.dao.HouseDao;
import com.sabot.manage_sys.domain.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseController {

    @Autowired
    private HouseDao houseDao;

    @GetMapping("/findHouseByPage")
    public ResultResponse findHouseByPage(@RequestParam(value="pageNo",defaultValue="1")int pageNo,
                                          @RequestParam(value="pageSize",defaultValue="10")int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<House> List = houseDao.findHouseList();
        return ResultResponse.success(new PageInfo<>(List));
    }

    @GetMapping("/findHouseById")
    public ResultResponse findHouseById(Integer id){
        return ResultResponse.success(houseDao.findHouseById(id));
    }

    @PostMapping("/updateHouseById")
    public ResultResponse updateHouseById(House house){
        if(houseDao.updateHouseById(house) == 1){
            return ResultResponse.success("修改成功");
        }
        return ResultResponse.error("修改失败");
    }
}
