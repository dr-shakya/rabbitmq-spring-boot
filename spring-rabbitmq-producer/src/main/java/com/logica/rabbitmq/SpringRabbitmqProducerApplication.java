package com.logica.rabbitmq;

import com.logica.rabbitmq.model.Employee;
import com.logica.rabbitmq.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRabbitmqProducerApplication {


//public class SpringRabbitmqProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqProducerApplication.class, args);
	}
/*
	@Autowired
	Producer producer;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setEmployeeId("One");
		employee.setEmployeeName("Employee One");

		producer.produce(employee);
	}*/
}

