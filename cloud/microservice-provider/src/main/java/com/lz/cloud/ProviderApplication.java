package com.lz.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:04
 * version $Id: ProviderApplication.java$
 */
@MapperScan("com.lz.cloud.dao")
@ComponentScan(basePackages = "com.lz.cloud")
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class, args);
    }
}
