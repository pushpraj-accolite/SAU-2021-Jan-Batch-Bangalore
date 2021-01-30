package com.namegenerator.au2021rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@RequestMapping("/")
	public String home() {
		return "Hey it started working!! Go checkout your operations...";
	}
}
