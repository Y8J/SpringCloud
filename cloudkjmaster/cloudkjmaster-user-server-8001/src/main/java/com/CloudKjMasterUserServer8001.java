package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableDiscoveryClient // 服务发现
@EnableEurekaClient // 本服务启动后会注册到Eureka服务注册中心
@MapperScan(basePackages = "com.cloud.kj.master.server.mapper")
@EnableTransactionManagement//开启事务管理
@SpringBootApplication
public class CloudKjMasterUserServer8001 {
 
	public static void main(String[] args) {
		SpringApplication.run(CloudKjMasterUserServer8001.class, args);
	}
}
