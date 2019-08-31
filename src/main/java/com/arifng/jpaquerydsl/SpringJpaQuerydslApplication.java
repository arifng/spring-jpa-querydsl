package com.arifng.jpaquerydsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.arifng.jpaquerydsl.repository")
public class SpringJpaQuerydslApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaQuerydslApplication.class, args);
	}

}
