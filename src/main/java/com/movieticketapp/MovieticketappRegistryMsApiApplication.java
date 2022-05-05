package com.movieticketapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MovieticketappRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieticketappRegistryMsApiApplication.class, args);
	}

}
