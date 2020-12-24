package com.hongbao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.hongbao.dao")
@SpringBootApplication
public class HongbaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HongbaoApplication.class, args);
    }

}
