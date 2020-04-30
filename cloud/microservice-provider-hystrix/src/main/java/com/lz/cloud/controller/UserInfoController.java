package com.lz.cloud.controller;

import com.lz.cloud.entity.UserInfo;
import com.lz.cloud.service.UserInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:02
 * version $Id: UserInfoController.java$
 */
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addUser(@RequestBody UserInfo user) {
        boolean flag = userInfoService.addUser(user);
        return flag;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hystrixGetUser") //一旦服务调用失败，就调用hystrixGetUser方法
    public UserInfo getUser(@PathVariable("id") int id) {
        UserInfo user = userInfoService.getUser(id);
        if(user == null){
            throw new RuntimeException("不存在id=" + id + "对应的用户信息");
        }
        return user;
    }

    @RequestMapping(value = "/getUser/list", method = RequestMethod.GET)
    public List<UserInfo> getUsers() {
        List<UserInfo> users = userInfoService.getUsers();
        return users;
    }

    public UserInfo hystrixGetUser(@PathVariable("id") int id) {
        UserInfo user = new UserInfo(id, "不存在该用户", 0);
        return user;
    }

}
