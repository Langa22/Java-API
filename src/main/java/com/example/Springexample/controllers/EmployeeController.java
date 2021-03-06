package com.example.Springexample.controllers;

import com.example.Springexample.model.Employee;
import com.example.Springexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService eService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return eService.getEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployees(@PathVariable("id") Long id){
        return eService.getSingEmployee(id);
    }
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return eService.saveEmployee(employee);
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        employee.setId(id);
        return eService.updateEmployee(employee);
    }
    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam Long id){
        eService.deleteEmployee(id);
    }
}
