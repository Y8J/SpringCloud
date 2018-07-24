package com.jpa.service.impl;

import com.jpa.mapper.UserDao;
import com.jpa.pojo.User;
import com.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;


    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
