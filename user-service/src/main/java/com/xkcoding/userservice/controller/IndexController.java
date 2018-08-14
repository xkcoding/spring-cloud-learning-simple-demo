package com.xkcoding.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 首页 Controller
 * </p>
 *
 * @package: com.xkcoding.orderservice.controller
 * @description： 首页 Controller
 * @author: yangkai.shen
 * @date: Created in 2018/8/13 下午10:23
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
public class IndexController {

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${server.port}")
	private String port;

	@GetMapping("/index")
	public String index() {
		return "欢迎来到：" + applicationName + " 当前端口号为：" + port;
	}
}
