package com.lz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:24
 * version $Id: FeignConsumerHystrixApplication.java$
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashbordConsumerApplication  {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashbordConsumerApplication .class, args);
    }
}
