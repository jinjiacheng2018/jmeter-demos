package com.jmeter.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.jmeter.boot.mapper"})
@SpringBootApplication
public class Jmeter1Application {

    public static void main(String[] args) {
        SpringApplication.run(Jmeter1Application.class, args);
    }

}
