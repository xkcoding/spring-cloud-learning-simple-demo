package com.xkcoding.orderservice.controller;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.RandomUtil;
import com.google.common.collect.Lists;
import com.xkcoding.dto.OrderDTO;
import com.xkcoding.orderservice.model.OrderDO;
import com.xkcoding.service.IOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * <p>
 * 订单 Controller
 * </p>
 *
 * @package: com.xkcoding.orderservice.controller
 * @description： 订单 Controller
 * @author: yangkai.shen
 * @date: Created in 2018/8/13 下午10:28
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
@RequestMapping("/api/order")
public class OrderController implements IOrderService {
	private static final List<OrderDO> orderDOList = Lists.newArrayList();

	@Autowired
	private ModelMapper mapper;

	@PostConstruct
	public void init() {
		for (long i = 0; i < 10L; i++) {
			orderDOList.add(OrderDO.builder().id(i).name("订单" + i).detail("订单" + i + "的详情").amount(NumberUtil.round(RandomUtil.randomDouble(1000, 2000), 2)).build());
		}
	}

	/**
	 * 创建订单
	 *
	 * @param dto 订单实体
	 * @return 创建的订单对象
	 */
	@Override
	@PostMapping("")
	public OrderDTO create(@RequestBody OrderDTO dto) {
		OrderDO map = mapper.map(dto, OrderDO.class);
		map.setId((long) (orderDOList.size()));
		dto.setId(map.getId());
		orderDOList.add(map);
		return dto;
	}

	/**
	 * 根据订单 id 获取订单对象
	 *
	 * @param id 订单id
	 * @return 订单对象
	 */
	@Override
	@GetMapping("/{id}")
	public OrderDTO getMyOrder(@PathVariable Long id) {
		if (id > orderDOList.size()) {
			return new OrderDTO();
		}
		OrderDO order = orderDOList.get(id.intValue());
		return mapper.map(order, OrderDTO.class);
	}

	/**
	 * 获取所有订单列表
	 *
	 * @return 订单列表
	 */
	@GetMapping("")
	public List<OrderDO> getAll() {
		return orderDOList;
	}
}
