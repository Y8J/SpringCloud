package com.jpa.service;

import com.jpa.pojo.User;

public interface UserService {

    User findById(Long id);

    User findByName(String name);
}
