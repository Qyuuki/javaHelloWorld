package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHelloWorld {
	@GetMapping(value = "japan")
	String japan() {
		return "日本へようこそ！！";
	}

	@GetMapping(value = "us")
	String us() {
		return "Welcome to America！！";
	}

	@GetMapping(value = "france")
	String france() {
		return "Bienvenue en France！！";
	}

	@GetMapping(value = "korea")
	String korea() {
		return "한국에 오신 것을 환영합니다! !";
	}
}
