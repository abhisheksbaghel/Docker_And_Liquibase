package com.ff4j.languagefeature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LanguageFeatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguageFeatureApplication.class, args);
	}

}
