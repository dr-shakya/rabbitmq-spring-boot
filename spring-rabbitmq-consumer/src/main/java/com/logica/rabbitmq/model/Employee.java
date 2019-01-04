package com.logica.rabbitmq.model;

public class Employee {

    public String employeeId;
    public String employeeName;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee [empName=" + employeeName + ", empId=" + employeeId + "]";
    }
}

