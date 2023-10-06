package com.thread.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home_Contoller {
//	h
	@GetMapping("/check")
	public String check() {
		return "This is checking";

	}
}
