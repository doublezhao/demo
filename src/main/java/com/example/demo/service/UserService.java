package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author kzhao
 * @Date 10/21/2019 3:08 PM
 **/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }

}
