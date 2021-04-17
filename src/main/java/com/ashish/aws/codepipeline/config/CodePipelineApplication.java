package com.ashish.aws.codepipeline.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ashish.aws.codepipeline")
public class CodePipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodePipelineApplication.class, args);
	}

}
