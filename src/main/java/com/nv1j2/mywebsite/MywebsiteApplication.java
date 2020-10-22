package com.nv1j2.mywebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//spring boot主配置类，入口，会运行此类的main方法
public class MywebsiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(MywebsiteApplication.class, args);
    }

}
