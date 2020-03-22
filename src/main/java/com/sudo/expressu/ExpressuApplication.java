package com.sudo.expressu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ExpressuApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpressuApplication.class, args);
	}

}
