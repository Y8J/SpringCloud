package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 配置中心模拟客户端
 * @author yangjing
 *
 */

@SpringBootApplication
public class ConfigClient8008 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient8008.class, args);
	}
}
