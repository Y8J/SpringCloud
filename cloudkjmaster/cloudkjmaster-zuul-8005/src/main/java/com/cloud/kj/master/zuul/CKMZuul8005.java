package com.cloud.kj.master.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * SpringCloud路由网关zuul
 * @author yangjing
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class CKMZuul8005 {

	public static void main(String[] args) {
		SpringApplication.run(CKMZuul8005.class, args);
	}
}
