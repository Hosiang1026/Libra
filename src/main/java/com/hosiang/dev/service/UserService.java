package com.hosiang.dev.service;

import java.util.List;

import com.hosiang.dev.bean.UserBean;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	/**
	 * 获取全部
	 * 
	 * @return
	 */
    List<UserBean> findAll();

	/**
	 * 持久化
	 * 
	 * @param userBean
	 * @return
	 */
    void save(UserBean userBean) throws Exception;
}
