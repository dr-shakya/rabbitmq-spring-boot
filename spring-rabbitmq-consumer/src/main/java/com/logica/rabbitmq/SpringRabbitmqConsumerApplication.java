package com.logica.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringRabbitmqConsumerApplication {

	public static void main(String[] args) throws  IOException {
		SpringApplication.run(SpringRabbitmqConsumerApplication.class, args);
	}

}

