package com.sabot.manage_sys.controller;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.sabot.manage_sys.config.ResultResponse;
import com.sabot.manage_sys.dao.FamilyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyController {

    @Autowired
    private FamilyDao familyDao;

    @GetMapping("/findFamilyById")
    public ResultResponse findFamilyId(Integer familyId){
        return ResultResponse.success(familyDao.findFamilyById(familyId));
    }
}
