package com.service.impl;

import com.mappers.UserMapper;
import com.model.User;
import com.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/3/22.
 */
@Service
public class ServiceTestImpl implements ServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User query () {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getName());
        System.out.println("query");
        return user;
    }
}
