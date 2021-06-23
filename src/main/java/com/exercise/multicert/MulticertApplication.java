package com.exercise.multicert;

import com.exercise.multicert.model.Pessoa;
import com.exercise.multicert.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MulticertApplication {

	public static void main(String[] args) {
		SpringApplication.run(MulticertApplication.class, args);
	}


}
