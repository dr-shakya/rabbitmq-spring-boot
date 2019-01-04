package com.logica.rabbitmq.consumer;

import com.logica.rabbitmq.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Consumer {

//    @RabbitListener(queues="${rabbitmq.queue}", containerFactory="jsaFactory")
    public void receivedMessage(Employee employee) {
        System.out.println("Received Message: " + employee);
    }
}
