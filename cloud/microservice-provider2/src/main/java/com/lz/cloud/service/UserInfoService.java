package com.lz.cloud.service;

import com.lz.cloud.entity.UserInfo;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 14:59
 * version $Id: UserInfoService.java$
 */
public interface UserInfoService {
    public boolean addUser(UserInfo user);

    public UserInfo getUser(int id);

    public List<UserInfo> getUsers();
}
