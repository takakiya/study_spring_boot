package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {
	//	http://localhost:8080/fortune
	@RequestMapping("/fortune")
	public String start() {

		double fn = Math.random();

		if (fn >= 0.7) {
			return "greatFortune.html";
		} else if (fn >= 0.4) {
			return "middleFortune.html";

		} else if (fn >= 0.1) {
			return "smallFortune.html";

		} else {
			return "misFortune.html";

		}
	}
}
