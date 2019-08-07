package com.dream.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: 入口程序类
 *
 *@author JinJiacheng
 *@date 2019/8/7 22:45
 */
@MapperScan(basePackages = {"com.dream.boot.domain"})
@SpringBootApplication
public class Dream1Application
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(Dream1Application.class, args);
    }
    
}
