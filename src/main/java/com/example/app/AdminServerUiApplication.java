package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServerUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerUiApplication.class, args);
	}

}
