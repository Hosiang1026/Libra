package com.hosiang.dev.service;

import com.hosiang.dev.bean.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

	/**
	 * 获取全部
	 * 
	 * @return
	 */
    List<Order> findAll();

	/**
	 * 持久化
	 * 
	 * @param entity
	 * @return
	 */
    void save(Order entity) throws Exception;
}
