package com.cloud.kj.master.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate提供了多种便捷访问远程Http服务的方法，
 * 是一种简单高效便捷的访问restful服务模板类，
 * 是Spring提供的用于访问Rest服务的客户端模板工具类集
 * （url,requestMap,ResponseBean.class）三个参数分别
 * 代表Rest请求地址，请求参数，HTTP响应转换被转换的对象类型
 * @author yangjing
 * 
 * @Configuration可理解为用spring的时候xml里面的<beans>标签
 * @Bean可理解为用spring的时候xml里面的<bean>标签
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate(){
		return new RestTemplate();
	}
}
