package com.lz.cloud.controller;

import com.lz.cloud.entity.UserInfo;
import com.lz.cloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:23
 * version $Id: UserInfoConsumerController.java$
 */
@RestController
public class UserInfoConsumerController {

//    @Value("${provider}")
//    private  String REST_URL_PREFIX;


//    private static String REST_URL_PREFIX = "http://microservicecloud-provider";

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired(required = false)
    private ConsumerService consumerService;


    @RequestMapping(value="/consumer/add")
    public boolean addUser(UserInfo user){
        Boolean flag = consumerService.add(user);
        return flag;
    }

    @RequestMapping(value="/consumer/get/{id}")
    public UserInfo get(@PathVariable("id") int id){
        UserInfo user = consumerService.get(id);
        return user;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value="/consumer/list")
    public List<UserInfo> getList(){
        List list = consumerService.getAll();
        return list;
    }


}
