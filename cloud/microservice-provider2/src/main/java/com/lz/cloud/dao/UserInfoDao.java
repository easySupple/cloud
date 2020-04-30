package com.lz.cloud.dao;

import com.lz.cloud.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 14:56
 * version $Id: UserInfoDao.java$
 */

public interface UserInfoDao {
    public boolean addUser(UserInfo user);

    public UserInfo getUser(int id);

    public List<UserInfo> getUsers();
}
