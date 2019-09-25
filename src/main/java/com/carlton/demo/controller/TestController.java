package com.carlton.demo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlton.demo.service.TestService;

/***
 * 测试controller
* <p>Title: TestController</p>  
* <p>Description: </p>  
* @author Carlton  
* @date 2018年9月28日
 */
@RestController
public class TestController {

	@Autowired
	TestService testService;

	@PostMapping("/testMapper")
	public List<Object> testMe() {
		int r = testService.testMapper();
		List<Object> list = new LinkedList<>();
		list.add(r);
		return list;
	}
}
