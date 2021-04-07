package com.factory.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class TeamController {

	@GetMapping("/hello")
	public String getTeamHello() {
		return "Welcome To AMF Team";
	}
	
}

