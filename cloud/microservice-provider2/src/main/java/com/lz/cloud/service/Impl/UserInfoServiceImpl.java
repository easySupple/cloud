package com.lz.cloud.service.Impl;

import com.lz.cloud.dao.UserInfoDao;
import com.lz.cloud.entity.UserInfo;
import com.lz.cloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 15:00
 * version $Id: UserInfoServiceImpl.java$
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired(required = false)
    private UserInfoDao userInfoDao;

    @Override
    public boolean addUser(UserInfo user) {
       return userInfoDao.addUser(user);
    }

    @Override
    public UserInfo getUser(int id) {

        System.out.println("microservice-provider2 微服务在响应客户端请求……");

        return userInfoDao.getUser(id);
    }

    @Override
    public List<UserInfo> getUsers() {
        return userInfoDao.getUsers();
    }
}
