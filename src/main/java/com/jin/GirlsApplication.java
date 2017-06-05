package com.jin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jin.*.dao")
public class GirlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GirlsApplication.class, args);
    }
}
