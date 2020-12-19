package com.sabot.manage_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sabot.manage_sys.dao")
public class ManageSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageSysApplication.class, args);
    }

}
