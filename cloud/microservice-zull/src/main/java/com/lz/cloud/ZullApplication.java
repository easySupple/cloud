package com.lz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:04
 * version $Id: ProviderHystrixApplication.java$
 */
@SpringBootApplication
@EnableZuulProxy
public class ZullApplication  {

    public static void main(String[] args) {

        SpringApplication.run(ZullApplication .class, args);
    }
}
