package com.ashish.aws.codepipeline.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path = "/health")
	public String health() {
		return "success";
	}
}
