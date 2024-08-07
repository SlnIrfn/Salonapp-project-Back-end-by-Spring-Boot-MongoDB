package com.salonappbackend.Salon.App.Backend.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SalonAppBackendProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalonAppBackendProjectApplication.class, args);
	}
}
