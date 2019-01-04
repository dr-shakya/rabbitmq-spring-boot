package com.logica.rabbitmq.controller;

import com.logica.rabbitmq.consumer.Consumer;
import com.logica.rabbitmq.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    Consumer consumer;

    @RabbitListener(queues="${rabbitmq.queue}", containerFactory="jsaFactory")
    @GetMapping("/consumer")
    public void consume(Employee employee){
        System.out.println("Employee in consume:" + employee);
        consumer.receivedMessage(employee);
    }
}
