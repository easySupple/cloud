package com.lz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:24
 * version $Id: FeignConsumerHystrixApplication.java$
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.lz.cloud.service")
public class FeignConsumerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerHystrixApplication.class, args);
    }
}
