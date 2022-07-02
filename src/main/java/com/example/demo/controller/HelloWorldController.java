package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!!");

		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");

		model.addAttribute("java", now.format(f));

		return "index";
	}
}