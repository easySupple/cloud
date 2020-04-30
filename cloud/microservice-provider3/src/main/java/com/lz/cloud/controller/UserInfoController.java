package com.lz.cloud.controller;

import com.lz.cloud.entity.UserInfo;
import com.lz.cloud.service.UserInfoService;
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

    @RequestMapping(value="/add", method= RequestMethod.POST)
    public boolean addUser(@RequestBody UserInfo user){
        boolean flag = userInfoService.addUser(user);
        return flag;
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public UserInfo getUser(@PathVariable("id") int id){
        UserInfo user = userInfoService.getUser(id);
        return user;
    }

    @RequestMapping(value="/getUser/list", method=RequestMethod.GET)
    public List<UserInfo> getUsers(){
        List<UserInfo> users = userInfoService.getUsers();
        return users;
    }

}
