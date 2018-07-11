package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心启动类
 * @author yangjing
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer8006 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer8006.class, args);
	}
}
