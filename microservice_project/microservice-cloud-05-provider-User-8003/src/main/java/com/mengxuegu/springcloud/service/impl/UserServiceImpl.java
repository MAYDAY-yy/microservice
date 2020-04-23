package com.mengxuegu.springcloud.service.impl;

import com.mengxuegu.springcloud.entities.Users;
import com.mengxuegu.springcloud.mapper.UserMapper;
import com.mengxuegu.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean add(Users users) {
        return userMapper.addUser(users);
    }

    @Override
    public Users get(int uid) {
        return userMapper.findById(uid);
    }

    @Override
    public List<Users> list() {
        return userMapper.findAll();
    }

    @Override
    public boolean del(Users users) {
        return userMapper.delUser(users);
    }

}
