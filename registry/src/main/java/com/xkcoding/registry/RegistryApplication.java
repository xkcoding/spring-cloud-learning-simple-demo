package com.xkcoding.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * Eureka 注册中心
 * </p>
 *
 * @package: com.xkcoding.registry
 * @description： Eureka 注册中心
 * @author: yangkai.shen
 * @date: Created in 2018/8/13 下午8:28
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryApplication.class, args);
	}
}
