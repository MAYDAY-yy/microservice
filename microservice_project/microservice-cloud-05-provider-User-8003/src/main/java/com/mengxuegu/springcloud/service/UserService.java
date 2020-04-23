package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Users;

import java.util.List;

public interface UserService {
    boolean add(Users users);

    Users get(int uid);

    List<Users> list();

    boolean del(Users users);
}
