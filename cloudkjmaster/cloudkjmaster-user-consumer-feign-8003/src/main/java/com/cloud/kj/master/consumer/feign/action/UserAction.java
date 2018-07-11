package com.cloud.kj.master.consumer.feign.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.kj.master.api.pojo.PojoPages;
import com.cloud.kj.master.api.pojo.User;
import com.cloud.kj.master.api.service.UserClientService;

@RequestMapping("consumer")
@Controller
public class UserAction {

	@ResponseBody
	@RequestMapping("index.do")
	public String index(){
		return "jjjjjjjjjjjjjjjjjjjjj";
	}
	
	/**
	 * Feign负载均衡service引用
	 */
	@Autowired
	private UserClientService userClientService;
	
	@ResponseBody
	@RequestMapping(value = "user/get/{id}")
	public User get(@PathVariable("id") Long id){
		return this.userClientService.get(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "user/list")
	public List<User> list(@RequestBody PojoPages<User> page){
		return this.userClientService.list(page);
	}
	
	@ResponseBody
	@RequestMapping(value = "user/add")
	public Integer add(@RequestBody User user){
		return this.userClientService.add(user);
	}
}
