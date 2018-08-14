package com.xkcoding.configclient.controller;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * 首页 Controller
 * </p>
 *
 * @package: com.xkcoding.configclient.controller
 * @description： 首页 Controller
 * @author: yangkai.shen
 * @date: Created in 2018/8/14 下午2:55
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
@RefreshScope
@RequestMapping("/api")
public class IndexController {
	@Value("${demo.name}")
	private String name;

	@Value("${demo.version}")
	private String version;

	@GetMapping("/info")
	public Map<String, Object> info() {
		Map<String, Object> ret = Maps.newHashMap();
		ret.put("name", name);
		ret.put("version", version);
		return ret;
	}
}
