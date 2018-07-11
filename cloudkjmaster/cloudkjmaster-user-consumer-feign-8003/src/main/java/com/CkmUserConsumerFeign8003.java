package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
//api 工程底下的包
@EnableFeignClients(basePackages = {"com.cloud.kj.master.api.service"})
//扫描本工程文件下的包
@ComponentScan(basePackages = {"com.cloud.kj.master.consumer.feign",
		                       "com.cloud.kj.master.api.service.hystrix"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CkmUserConsumerFeign8003 {


	public static void main(String[] args) {
		SpringApplication.run(CkmUserConsumerFeign8003.class, args);
	}
}
