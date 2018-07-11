package com.cloud.kj.master.act;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.kj.master.api.pojo.PojoPages;
import com.cloud.kj.master.api.pojo.User;


@RestController
public class UserControllerConsumer {

	//服务提供者请求的链接地址页端口号
	private static final String REST_URL_PREFIX = "http://localhost:8000";
	
	//服务提供者请求的链接地址页端口号 Ribbon负载均衡
	/**
	 * http://SPRINGCLOUDGD-SERVER-USER-8000服务名称来调用服务的接口，
	 * 相比之前的http://localhost:8001，Ribbon和Eureka整合后，
	 * Consumer可以直接通过服务名称来调用服务，而不再关心地址和端口号。
	 */                          
	private static final String REST_URL_PREFIX_TWO = "http://ckm-user-server-8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/user/add")
	public Integer add(User user){
		return restTemplate.postForObject(REST_URL_PREFIX_TWO+"/user/add", user, Integer.class);
	}
	
	@RequestMapping(value="/consumer/user/get/{id}")
	public User get(@PathVariable("id") Long id){
		return restTemplate.getForObject(REST_URL_PREFIX_TWO+"/user/get/"+id, User.class);
	}
	
	@RequestMapping(value="/consumer/user/list")
	public List<User> list(@RequestBody PojoPages<User> page){
		return restTemplate.postForObject(REST_URL_PREFIX_TWO+"/user/list/",page, List.class);
	}
	
	@RequestMapping(value="/consumer/user/pageListPost")
	public List<User> pageListPost(@RequestBody PojoPages<User> page){
		return restTemplate.postForObject(REST_URL_PREFIX_TWO+"/user/pagelist/",page, List.class);
	}
	
	@RequestMapping(value="/consumer/user/pageListPut")
	public void pageListPut(@RequestBody PojoPages<User> page){
		restTemplate.put(REST_URL_PREFIX_TWO+"/user/putAdd/", page);
	}
	
	@RequestMapping(value="/consumer/user/deleteid/{id}")
	public void pageListPut(@PathVariable("id") Long id){
		restTemplate.delete(REST_URL_PREFIX_TWO+"/user/deleteid/"+id);
	}
}
