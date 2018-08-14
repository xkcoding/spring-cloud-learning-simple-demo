package com.xkcoding.userservice.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.xkcoding.dto.OrderDTO;
import com.xkcoding.userservice.feign.OrderClient;
import com.xkcoding.userservice.model.CustomerDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户 Controller
 * </p>
 *
 * @package: com.xkcoding.userservice.controller
 * @description： 用户 Controller
 * @author: yangkai.shen
 * @date: Created in 2018/8/14 上午10:06
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
@RequestMapping("api/user")
public class CustomerController {
	private static final List<CustomerDO> customerDOList = Lists.newArrayList();

	@Autowired
	private OrderClient orderClient;

	@PostConstruct
	public void init() {
		for (long i = 0; i < 2L; i++) {
			customerDOList.add(CustomerDO.builder().id(i).username("用户" + i).password("******").role(i % 2 == 0 ? "ROLE_ADMIN" : "ROLE_USER").build());
		}
	}

	/**
	 * 添加用户
	 *
	 * @param customerDO 用户实体
	 * @return 添加的用户对象
	 */
	@PostMapping("")
	public CustomerDO create(@RequestBody CustomerDO customerDO) {
		customerDO.setId((long) (customerDOList.size()));
		customerDOList.add(customerDO);
		return customerDO;
	}

	/**
	 * 根据订单 id 获取订单对象
	 *
	 * @param id 订单id
	 * @return 订单对象
	 */
	@GetMapping("/{id}/me")
	public Map<String, Object> getMyInfo(@PathVariable Long id) {
		Map<String, Object> ret = Maps.newHashMap();

		if (id > customerDOList.size()) {
			ret.put("msg", "用户不存在");
			return ret;
		}
		
		CustomerDO customerDO = customerDOList.get(id.intValue());
		OrderDTO myOrder = orderClient.getMyOrder(id);

		ret.put("user", customerDO);
		ret.put("order", myOrder);

		return ret;
	}

	/**
	 * 获取所有用户列表
	 *
	 * @return 用户列表
	 */
	@GetMapping("")
	public List<CustomerDO> getAll() {
		return customerDOList;
	}
}
