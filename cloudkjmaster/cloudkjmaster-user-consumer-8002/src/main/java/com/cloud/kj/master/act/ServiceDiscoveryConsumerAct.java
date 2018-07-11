package com.cloud.kj.master.act;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceDiscoveryConsumerAct {

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
	
	@RequestMapping(value="/consumer/discovery")
	public Object add(){
		return restTemplate.getForObject(REST_URL_PREFIX_TWO+"/user/discovery", Object.class);
	}
}
