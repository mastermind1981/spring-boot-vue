package com.leegebe.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot初始化
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SampleController {


    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
        new SpringApplication(SampleController.class).run(args);
    }

}
