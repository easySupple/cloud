package com.lz.cloud.service;

import com.lz.cloud.entity.UserInfo;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/29 17:36
 * version $Id: ConsumerServiceFallbackFactory.java$
 */
@Component
public class ConsumerServiceFallbackFactory implements FallbackFactory<ConsumerService> {
    @Override
    public ConsumerService create(Throwable throwable) {
        return new ConsumerService() {

            @Override
            public List<UserInfo> getAll() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public UserInfo get(int id) {
                UserInfo user = new UserInfo(id, "该用户不存在", 0);
                return user;
            }

            @Override
            public boolean add(UserInfo user) {
                // TODO Auto-generated method stub
                return false;
            }
        };

    }
}
