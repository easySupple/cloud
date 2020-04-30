package com.lz.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:22
 * version $Id: ConfigBean.java$
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @Bean
    public IRule myRule(){
        return new RoundRobinRule(); 	//轮询策略
    }
}
