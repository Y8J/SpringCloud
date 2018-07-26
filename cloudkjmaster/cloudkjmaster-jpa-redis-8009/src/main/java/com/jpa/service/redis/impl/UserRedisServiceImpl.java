package com.jpa.service.redis.impl;

import com.jpa.pojo.User;
import com.jpa.service.redis.UserRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserRedisServiceImpl implements UserRedisService {
    @Autowired
    @Resource(name = "redisTemplateUser")
    private RedisTemplate redisTemplate;
    private static String USER_KEY = "User";
    @Override
    public void save(User user) {
        this.redisTemplate.opsForHash().put(USER_KEY, user.getId(), user);
    }
    @Override
    public User find(Long id) {
        return (User) this.redisTemplate.opsForHash().get(USER_KEY, id);
    }
    @Override
    public Map<Object, Object> findAll() {
        return this.redisTemplate.opsForHash().entries(USER_KEY);
    }
    @Override
    public void delete(Long id) {
        this.redisTemplate.opsForHash().delete(USER_KEY, id);
    }
}
