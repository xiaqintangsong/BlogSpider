package com.wangyi.blogspider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.wangyi.blogspider.mapper") //标记Mybatis的接口
public class BlogspiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogspiderApplication.class, args);
    }
}
