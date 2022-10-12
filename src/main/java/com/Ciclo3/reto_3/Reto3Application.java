package com.Ciclo3.reto_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.Ciclo3.reto_3.Models")
@SpringBootApplication(scanBasePackages ="com.Ciclo3.reto_3")
@EnableJpaRepositories("com.Ciclo3.reto_3.Repository")

public class Reto3Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}

}
