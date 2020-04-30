package com.lz.cloud.controller;

import com.lz.cloud.entity.UserInfo;
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


    private static String REST_URL_PREFIX = "http://microservicecloud-provider";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/add")
    public boolean addUser(UserInfo user){
        Boolean flag = restTemplate.postForObject(REST_URL_PREFIX + "/add", user, Boolean.class);
        return flag;
    }

    @RequestMapping(value="/consumer/get/{id}")
    public UserInfo get(@PathVariable("id") int id){
        UserInfo user = restTemplate.getForObject(REST_URL_PREFIX + "/get/" + id, UserInfo.class);
        return user;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value="/consumer/list")
    public List<UserInfo> getList(){
        List list = restTemplate.getForObject(REST_URL_PREFIX + "/getUser/list", List.class);
        return list;
    }

}
