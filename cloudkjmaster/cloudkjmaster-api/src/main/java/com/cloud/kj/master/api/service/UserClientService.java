package com.cloud.kj.master.api.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud.kj.master.api.pojo.PojoPages;
import com.cloud.kj.master.api.pojo.User;
import com.cloud.kj.master.api.service.hystrix.UserClientServiceFallbackFactory;

@FeignClient(value = "CKM-USER-SERVER-8001",fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {

	@RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
	public User get(@PathVariable("id") Long id);
	
	@RequestMapping(value = "/user/list",method = RequestMethod.GET)
	public List<User> list(@RequestBody PojoPages<User> page);
	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public Integer add(@RequestBody User user);
}
