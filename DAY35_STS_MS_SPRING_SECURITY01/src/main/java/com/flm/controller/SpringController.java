package com.flm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {

	@GetMapping(value = {"/","/home"})
	public String home() {
		return "hello";
	}
}
