package com.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mybatis.model.Users;
import com.mybatis.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView index(){
		List<Users> list = userService.findUserAll();
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("list", list);
		return model;
	}
}
