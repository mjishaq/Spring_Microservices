package com.ishaq.microservices.netfixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetfixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetfixEurekaNamingServerApplication.class, args);
	}

}
