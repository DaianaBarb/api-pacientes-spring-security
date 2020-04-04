package com.mballen.curso.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMvcApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("1234"));
		System.out.println("senha: 1234 usuario: Admin");
	}
	
}
