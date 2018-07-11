package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//EurekaServer服务器端启动类，接收其它微服务注册进来
@EnableEurekaServer
public class ColudKjMasterEureka18000 {


	public static void main(String[] args) {
		SpringApplication.run(ColudKjMasterEureka18000.class, args);
	}
}
