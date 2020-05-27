package com.cbs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("hello")

public class HelloController {

	@RequestMapping("")
	public ModelAndView hello() {
		Map<String,String> map = new HashMap<>();
		map.put("data","test data");
		return new ModelAndView("hello",map);
	}
}