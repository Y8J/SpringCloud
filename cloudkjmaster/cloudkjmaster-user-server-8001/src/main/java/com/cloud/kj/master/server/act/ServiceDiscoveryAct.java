package com.cloud.kj.master.server.act;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 服务发现
 * 对于注册近Eureka里面的微服务，可以通过服务发现来获取该服务的信息
 * @author yangjing
 * 启动服务注册中心SpringCloudGd-eureka-8002，
 * 再启动SpringCloudGd-server-user-8000，
 * 访问http://localhost:8000/user/discovery可以得到这个服务的info信息，
 * /user/discovery接口就是SpringCloudGd-server-user-8000这个服务暴露给外部访问的接口。
 * 使用http://localhost:8000/user/discovery测试，就是自己测试能不能使用
 */
@Controller
public class ServiceDiscoveryAct {

	@Autowired
	private DiscoveryClient client;

	@ResponseBody
	@RequestMapping(value = "/user/discovery", method = RequestMethod.GET)
	public Object discovery(){
	  List<String> list = client.getServices();//得到Eureka中所有的微服务
	  System.out.println("**********" + list);

	  List<ServiceInstance> srvList = client.getInstances("CKM-USER-SERVER-8001");
	  for (ServiceInstance element : srvList) {
	    System.out.println(element.getServiceId() + "\t" 
	                       + element.getHost() + "\t" + element.getPort() + "\t"
	                       + element.getUri());
	  }
	  return this.client;
	}
}
