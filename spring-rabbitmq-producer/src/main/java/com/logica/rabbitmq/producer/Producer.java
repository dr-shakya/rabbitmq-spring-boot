package com.logica.rabbitmq.producer;

import com.logica.rabbitmq.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingKey}")
    private String routingkey;

    public void produce(Employee employee) {
        amqpTemplate.convertAndSend(exchange, routingkey, employee);
        System.out.println("Send msg = " + employee);

    }
}
