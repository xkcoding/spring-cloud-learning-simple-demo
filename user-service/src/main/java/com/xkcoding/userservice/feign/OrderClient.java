package com.xkcoding.userservice.feign;

import com.xkcoding.dto.OrderDTO;
import com.xkcoding.service.IOrderService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 * 远程调用 Order 服务
 * </p>
 *
 * @package: com.xkcoding.userservice.feign
 * @description： 远程调用 Order 服务
 * @author: yangkai.shen
 * @date: Created in 2018/8/14 上午10:15
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@FeignClient(value = "order", path = "/api/order")
@Component
public interface OrderClient extends IOrderService {
	/**
	 * 创建订单
	 *
	 * @param dto 订单实体
	 * @return 创建的订单对象
	 */
	@Override
	@PostMapping("")
	OrderDTO create(@RequestBody OrderDTO dto);

	/**
	 * 根据订单 id 获取订单对象
	 *
	 * @param id 订单id
	 * @return 订单对象
	 */
	@Override
	@GetMapping("/{id}")
	OrderDTO getMyOrder(@PathVariable(name = "id") Long id);
}
