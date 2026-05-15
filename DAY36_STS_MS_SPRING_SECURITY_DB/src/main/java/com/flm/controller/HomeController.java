package com.flm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value= {"/","/hello"})
	public String say() {
		return "home";
	}
}
