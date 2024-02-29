package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishService;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/wish-operations")
public class WishMessageOperationsController {
	@Autowired
	private IWishService service;
	
	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig cg;
	@Autowired
	private HttpSession ses;
	
	
	
	


	
	
	@RequestMapping("/home")
	public String showHomePage1() {
		return "welcome";
	}

	
	@RequestMapping("/wish")
	public String fetchWishMessage(Map<String,Object> map) {
		
		String msg=service.generateWishMessage();
		map.put("wMsg", msg);
		map.put("sysDate", new Date());
		
		return "show_result";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
