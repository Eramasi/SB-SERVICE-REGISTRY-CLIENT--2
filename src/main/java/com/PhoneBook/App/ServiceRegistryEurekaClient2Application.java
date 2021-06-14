package com.PhoneBook.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceRegistryEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryEurekaClient2Application.class, args);
	}

}
