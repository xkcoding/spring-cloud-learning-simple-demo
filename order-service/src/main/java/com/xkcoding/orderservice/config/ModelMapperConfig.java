package com.xkcoding.orderservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * ModelMapper 配置类
 * </p>
 *
 * @package: com.xkcoding.orderservice.config
 * @description： ModelMapper 配置类
 * @author: yangkai.shen
 * @date: Created in 2018/8/13 下午11:03
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Configuration
public class ModelMapperConfig {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
