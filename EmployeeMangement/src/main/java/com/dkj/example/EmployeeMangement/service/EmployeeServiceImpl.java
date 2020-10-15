package com.dkj.example.EmployeeMangement.service;

import com.dkj.example.EmployeeMangement.Repositry.EmployeeRepositry;
import com.dkj.example.EmployeeMangement.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepositry employeeRepositry;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepositry.save(employee);
    }
}
