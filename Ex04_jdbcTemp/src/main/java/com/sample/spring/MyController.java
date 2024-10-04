package com.sample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.spring.jdbc.MyUserDao;

@Controller
public class MyController {
	@Autowired
	private MyUserDao dao;

	@RequestMapping("/")
	public @ResponseBody String root() {
		return "jdbc test";
	}

	@RequestMapping("/user")
	public String userlistpage(Model model) {
		model.addAttribute("users", dao.list());
		return "userlist";
	}
}
