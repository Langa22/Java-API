package com.example.Springexample.service;

import com.example.Springexample.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee saveEmployee (Employee employee);
    Employee getSingEmployee(Long id);
    void deleteEmployee(Long id);
    Employee updateEmployee(Employee employee);
}
