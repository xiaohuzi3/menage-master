package com.linebook.menagemaster.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	public String index() {
		return "welcome to jenkins ";
	}
	@RequestMapping(value="/hello")
	public String helloWorld() {
		return "look line book is good";
	}
}
