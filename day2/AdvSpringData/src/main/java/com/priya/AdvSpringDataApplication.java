package com.priya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class AdvSpringDataApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(AdvSpringDataApplication.class, args);
	}

}
