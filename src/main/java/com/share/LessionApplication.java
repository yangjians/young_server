package com.share;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(value = "com.share.*.dao")
@EnableCaching
@SpringBootApplication
public class LessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(LessionApplication.class, args);
    }

}

