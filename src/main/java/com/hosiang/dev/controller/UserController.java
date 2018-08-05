package com.hosiang.dev.controller;

import com.hosiang.dev.bean.Order;
import com.hosiang.dev.bean.UserBean;
import com.hosiang.dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Blog：http://www.hosiang.cn
 *
 * @author Howe Hsiang
 *
 */
@Controller
/*@RequestMapping("/libra/user")*/
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/userlist")
	public String userList() {
		return "user/userList";
	}

	@GetMapping("/usercollect")
	public String userCollect() {
		return "user/userCollect";
	}

	/**
	 * 获取全部
	 *
	 * @return
	 */
	@PostMapping("/findAll")
	public @ResponseBody Object findAll() {
		return userService.findAll();
	}

	/**
	 * 持久化
	 * 
	 * @param userBean
	 * @return
	 */
	@PostMapping("/save")
	public @ResponseBody Map<String, Object> save(@RequestBody UserBean userBean) {
		Map<String, Object> result = new HashMap<>();
		try {
			userService.save(userBean);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}

}
