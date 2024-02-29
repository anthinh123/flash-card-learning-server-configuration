package com.thinh.serverconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerconfigurationApplication.class, args);
	}

}
