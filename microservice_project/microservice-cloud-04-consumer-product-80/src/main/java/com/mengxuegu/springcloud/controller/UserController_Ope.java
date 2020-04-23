package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entities.Product;
import com.mengxuegu.springcloud.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class UserController_Ope {
    private static final String REST_URL_PREFIX = "http://localhost:8003";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user/info/add")
    public boolean add(Users users) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/info/add", users, Boolean.class);
    }

    //删除
    @RequestMapping(value = "/user/info/delete")
    public Boolean delete(Users users) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/info/delete", users, Boolean.class);
    }

    @RequestMapping(value = "/user/info/get/{id}")
    public Users get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/info/get/" + id, Users.class);
    }

    @RequestMapping(value = "/user/info/list")
    public List<Users> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/info/list", List.class);
    }


}
