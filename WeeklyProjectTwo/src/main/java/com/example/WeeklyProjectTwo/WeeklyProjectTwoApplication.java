package com.example.WeeklyProjectTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.WeeklyProjectTwo.service.ProductRepository")
public class WeeklyProjectTwoApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeeklyProjectTwoApplication.class, args);
	}

}
