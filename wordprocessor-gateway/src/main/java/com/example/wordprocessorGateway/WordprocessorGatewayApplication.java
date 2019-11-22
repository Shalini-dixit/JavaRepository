package com.example.wordprocessorGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WordprocessorGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordprocessorGatewayApplication.class, args);
	}

}
