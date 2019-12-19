package com.edureka.micro.springedurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEdurekaServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringEdurekaServerApplication.class, args);
		System.out.println("Done");
	}
}
