package com.xkcoding.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * <p>
 * Zuul 网关
 * </p>
 *
 * @package: com.xkcoding.proxy
 * @description： Zuul 网关
 * @author: yangkai.shen
 * @date: Created in 2018/8/14 上午12:09
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}
}
