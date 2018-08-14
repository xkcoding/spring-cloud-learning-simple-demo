package com.xkcoding.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p>
 * 配置中心服务端
 * </p>
 *
 * @package: com.xkcoding.configserver
 * @description： 配置中心服务端
 * @author: yangkai.shen
 * @date: Created in 2018/8/14 上午12:13
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
