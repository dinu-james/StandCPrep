package com.dkj.example.EmployeeMangement.Repositry;

import com.dkj.example.EmployeeMangement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositry extends JpaRepository<Employee,Integer> {
}
