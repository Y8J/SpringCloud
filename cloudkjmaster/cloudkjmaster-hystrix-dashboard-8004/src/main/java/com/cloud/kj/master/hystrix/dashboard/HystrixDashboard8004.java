package com.cloud.kj.master.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * 断路服务监控平台
 * @author yangjing
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard8004 {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboard8004.class, args);
	}
	
}
