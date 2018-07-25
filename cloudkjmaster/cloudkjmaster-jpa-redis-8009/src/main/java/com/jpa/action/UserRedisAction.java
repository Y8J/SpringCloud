package com.jpa.action;

import com.jpa.pojo.User;
import com.jpa.service.redis.UserRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.Map;

@RequestMapping("ura")
@RestController
public class UserRedisAction {

    @Autowired
    private UserRedisService userRedisService;

    /**
     * 保存用户数据到reids
     */
    @RequestMapping(value = "saveUserRedis.do",method = RequestMethod.POST)
    public void saveUserRedis(@RequestBody User bean){
        bean.setName(bean.getName());
        bean.setStatus(bean.getStatus());
        bean.setMobile(bean.getMobile());
        bean.setEmail(bean.getEmail());
        bean.setPassword(bean.getPassword());
        userRedisService.save(bean);
    }

    /**
     *  根据id查询用户reids数据
     */
    @RequestMapping("find.do")
    public User find(Long id){
        return userRedisService.find(id);
    }

    /**
     * 查询全部用户reids数据
     * @return
     */
    @RequestMapping("findAll.do")
    public Map<Object, Object> findAll() {
        Map<Object, Object> map = this.userRedisService.findAll();
        return map;
    }

    /**
     * 根据id删除用户reids数据
     */
    @RequestMapping("deleteUserRedis.do")
    public void deleteUserRedis(Long id){
        userRedisService.delete(id);
    }
}
