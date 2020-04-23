package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<Users> findAll();

    Users findById(int uid);

    boolean addUser(Users users);

    boolean delUser(Users users);
}
