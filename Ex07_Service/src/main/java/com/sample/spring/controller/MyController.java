package com.sample.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.spring.service.ISimpleBbsService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
//	@Autowired
//	ISimpleBbsDao dao;

	@Autowired
	ISimpleBbsService bbs;

	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}

	@RequestMapping("/list")
	public String listPage(Model model) {
		model.addAttribute("lists", bbs.listDao());
		model.addAttribute("count", bbs.countDao());
		return "list";
	}

	@RequestMapping("/view") // view?id=1
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto", bbs.viewDao(sId));
		return "view";
	}

	@RequestMapping("/writeForm")
	public String writer() {
		return "writeForm";
	}

	@RequestMapping("/write")
	public String write(HttpServletRequest request) {
		bbs.writeDao(request.getParameter("writer"), request.getParameter("title"), request.getParameter("content"));
		return "redirect:list";
	}

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		bbs.delete(request.getParameter("id"));
		return "redirect:list";
	}

}
