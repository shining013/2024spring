package com.sample.demo.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.demo.dao.ISimpleDbsDao;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MyController {
	
	@Autowired
	ISimpleDbsDao dao;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "hello";
	}
	
	@RequestMapping("/list")
	public String listPage(Model model) {
		model.addAttribute("lists",dao.listDao());
		model.addAttribute("count",dao.countDao());
		return "list";
	}
	
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto",dao.viewDao(sId));
		return "view";
	}
}
