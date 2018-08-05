package com.hosiang.dev.service.impl;

import com.hosiang.dev.bean.Order;
import com.hosiang.dev.mapper.OrderRepository;
import com.hosiang.dev.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = false, rollbackFor = Throwable.class)
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	/**
	 * 获取全部
	 * 
	 * @return
	 */
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	/**
	 * 持久化
	 * 
	 * @param order
	 * @return
	 */
	public void save(Order order) {
		// 持久化
		orderRepository.save(order);
		// 如果持久化成功，就抛出异常。如果开启事务，那么刚才持久化的数据应回滚
		/*if (!StringUtils.isNullOrEmpty(entity.id))
			throw new Exception("测试无法持久化第一条数据的异常");*/
	}
}
