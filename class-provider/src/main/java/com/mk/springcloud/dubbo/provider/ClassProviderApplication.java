package com.mk.springcloud.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClassProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassProviderApplication.class, args);
	}

}
