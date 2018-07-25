package com.jpa.action;

import com.jpa.pojo.User;
import com.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UseAction {
    @Autowired
    UserService userService;

    @RequestMapping(value="/userById.do",method=RequestMethod.GET)
    public  User  userById(){
        User user = userService.findById(1L);
        return user;
    }


    @ResponseBody
    @RequestMapping(value="/userByName",method=RequestMethod.GET)
    public User userByName(){
        User aaa = userService.findByName("aaa");
        return aaa;
    }
}
