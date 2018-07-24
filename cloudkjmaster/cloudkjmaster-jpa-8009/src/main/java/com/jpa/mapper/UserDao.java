package com.jpa.mapper;

import com.jpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserDao extends JpaRepository<User,Long> {
    User findById(Long id);

    User findByName(String name);
}
