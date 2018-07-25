package com.jpa.service.redis;

import com.jpa.pojo.User;

import java.util.Map;

/**
 * 用户reids业务操作接口
 */
public interface UserRedisService {

    public void save(User user);

    public User find(Long id);

    public Map<Object, Object> findAll();

    public void delete(Long id);
}
