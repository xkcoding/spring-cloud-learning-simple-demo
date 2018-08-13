package com.xkcoding.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * <p>
 * 订单实体
 * </p>
 *
 * @package: com.xkcoding.orderservice.model
 * @description： 订单实体
 * @author: yangkai.shen
 * @date: Created in 2018/8/13 下午10:51
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDO {
	/**
	 * 订单id
	 */
	private Long id;

	/**
	 * 订单名称
	 */
	private String name;

	/**
	 * 订单详情
	 */
	private String detail;

	/**
	 * 订单总价
	 */
	private BigDecimal amount;
}
