package com.share.lession;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(value = "com.share.lession.*.dao")
@EnableCaching
@SpringBootApplication
public class LessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(LessionApplication.class, args);
    }

}

