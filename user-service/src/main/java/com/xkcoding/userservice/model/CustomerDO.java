package com.xkcoding.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 用户 DO
 * </p>
 *
 * @package: com.xkcoding.userservice.model
 * @description： 用户 DO
 * @author: yangkai.shen
 * @date: Created in 2018/8/14 上午10:03
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDO {
	/**
	 * 用户id
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 用户密码
	 */
	private String password;

	/**
	 * 用户角色
	 */
	private String role;
}
