package com.dkj.example.EmployeeMangement.controller;

import com.dkj.example.EmployeeMangement.model.Employee;
import com.dkj.example.EmployeeMangement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/status/test")
    public String test(){
        return "Employee-microservice is up !";
    }

    @RequestMapping(value ="/createEmployee",method= RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee){
        Employee emp = employeeService.createEmployee(employee);
        return emp;
    }

}
