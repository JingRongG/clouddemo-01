package com.guojr.eruakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EruakaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EruakaServerApplication.class, args);
	}
}
