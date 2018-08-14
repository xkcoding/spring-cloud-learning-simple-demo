package com.xkcoding.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 配置中心客户端
 * </p>
 *
 * @package: com.xkcoding.configclient
 * @description： 配置中心客户端
 * @author: yangkai.shen
 * @date: Created in 2018/8/14 下午3:02
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
