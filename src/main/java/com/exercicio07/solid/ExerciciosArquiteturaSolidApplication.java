package com.exercicio07.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ExerciciosArquiteturaSolidApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosArquiteturaSolidApplication.class, args);
	}

}
