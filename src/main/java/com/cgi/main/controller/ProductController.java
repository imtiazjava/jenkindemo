package com.cgi.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ProductController {

	@GetMapping("msg")
	public String message() {
		return "WELCOME TO HOME PAGE";
	}
}
