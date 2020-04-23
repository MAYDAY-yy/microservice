package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entities.Users;
import com.mengxuegu.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/info/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Users users) {
        return userService.add(users);
    }

    @RequestMapping(value = "/info/get/{uid}", method = RequestMethod.GET)
    public Users get(@PathVariable("uid") int uid) {
        return userService.get(uid);
    }

    @RequestMapping(value = "/info/list", method = RequestMethod.GET)
    public List<Users> list() {
        return userService.list();
    }

    @RequestMapping(value="/info/delete",method = RequestMethod.POST)
    public boolean del(@RequestBody Users users){
        return userService.del(users);
    }

}
