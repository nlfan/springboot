package com.sample.fish.core;

import org.springframework.boot.SpringApplication;

import com.sample.fish.core.config.Config;

public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}
}
