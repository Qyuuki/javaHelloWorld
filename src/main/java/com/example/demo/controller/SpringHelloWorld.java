package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHelloWorld {

	@GetMapping(value = "greeting")
	public String greeting(@RequestParam(value = "country", defaultValue = "japan") String country) {
		switch (country) {
		case "japan":
			return "日本へようこそ！！";
		case "us":
			return "Welcome to America！！";
		case "france":
			return "Bienvenue en France！！";
		case "korea":
			return "한국에 오신 것을 환영합니다! !";
		}

		return "該当する国はありません、japan, us, france, koreaのいずれかを指定して下さい。"
				+ "\n例 : http://localhost:8080/greeting?country=japan";
	}
}
