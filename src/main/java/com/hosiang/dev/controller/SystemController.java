package com.hosiang.dev.controller;

import java.util.Arrays;
import java.util.Map;

import com.hosiang.dev.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Blog：http://www.hosiang.cn
 *
 * @author Howe Hsiang
 *
 */
@Controller
/*@RequestMapping("/libra")*/
public class SystemController {

	@GetMapping("/")
	public String index() {
		return "system/index";
	}

	@GetMapping("/login")
	public String login() {
		return "system/login";
	}

	@GetMapping("/test")
	public String test(Map<String, Object> model) {
		model.put("text", "hello jsp");
		model.put("list", Arrays.asList(1, 2, 3, 4, 5));
		model.put("text", "hello jsp");
		return "orther/test";
	}
}
