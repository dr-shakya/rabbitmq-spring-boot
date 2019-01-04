package com.logica.rabbitmq.controller;

import com.logica.rabbitmq.model.Employee;
import com.logica.rabbitmq.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    Producer producer;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {

        Employee employee=new Employee(empId, empName);
//        employee.setEmployeeId(empId);
//        employee.setEmployeeName(empName);
        producer.produce(employee);

        return employee.toString();
    }
}
