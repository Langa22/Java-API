package com.example.Springexample.service;

import com.example.Springexample.model.Employee;
import com.example.Springexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepository eRepository;
    @Override
    public List<Employee> getEmployees() {
       return eRepository.findAll();
    }
}
