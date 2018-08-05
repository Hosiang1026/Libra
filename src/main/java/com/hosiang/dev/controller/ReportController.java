package com.hosiang.dev.controller;

import com.hosiang.dev.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Blog：http://www.hosiang.cn
 *
 * @author Howe Hsiang
 *
 */
@Controller
/*@RequestMapping("/libra/report")*/
@RequestMapping("/report")
public class ReportController {

	@GetMapping("/reportlist")
	public String productList() {
		return "report/reportList";
	}

}
