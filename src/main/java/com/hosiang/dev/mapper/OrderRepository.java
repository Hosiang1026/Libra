package com.hosiang.dev.mapper;

import com.hosiang.dev.bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Blog：http://www.hosiang.cn
 *
 * @author Howe Hsiang
 *
 */
public interface OrderRepository extends JpaRepository<Order, String> {

}
