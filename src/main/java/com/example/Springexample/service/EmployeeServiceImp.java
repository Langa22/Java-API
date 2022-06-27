package com.example.Springexample.service;

import com.example.Springexample.model.Employee;
import com.example.Springexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepository eRepository;
    @Override
    public List<Employee> getEmployees() {
       return eRepository.findAll();
    }
    public Employee saveEmployee(Employee employee){
       return eRepository.save(employee);
    }
    @Override
    public Employee getSingEmployee(Long id) {
        Optional<Employee>employee;
        employee = eRepository.findAllById(id);
        if(employee.isPresent()){
            return employee.get();
        }throw new RuntimeException("Employee not found for id "+id);
    }
    @Override
    public void deleteEmployee(Long id) {
        eRepository.deleteById(id);
    }
    @Override
    public Employee updateEmployee(Employee employee) {
        return eRepository.save(employee);
    }
}
