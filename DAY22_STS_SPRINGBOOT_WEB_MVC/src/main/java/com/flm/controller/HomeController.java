package com.flm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/displayname")
	public String displayname(HttpServletRequest request , Model model) {
		String name=request.getParameter("first_name");
		model.addAttribute("abc", name);
		return"employee";
	}

}
