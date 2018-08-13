package com.xkcoding.service;

import com.xkcoding.dto.OrderDTO;

/**
 * <p>
 * 订单 Service
 * </p>
 *
 * @package: com.xkcoding.service
 * @description： 订单 Service
 * @author: yangkai.shen
 * @date: Created in 2018/8/13 下午10:36
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface IOrderService {

	/**
	 * 创建订单
	 *
	 * @param dto 订单实体
	 * @return 创建的订单对象
	 */
	OrderDTO create(OrderDTO dto);

	/**
	 * 根据订单 id 获取订单对象
	 *
	 * @param id 订单id
	 * @return 订单对象
	 */
	OrderDTO getMyOrder(Long id);
}
