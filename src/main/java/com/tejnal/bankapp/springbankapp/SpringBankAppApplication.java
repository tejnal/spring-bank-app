package com.tejnal.bankapp.springbankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tejnal.bankapp.springbankapp.repository")
public class SpringBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBankAppApplication.class, args);
	}

}
