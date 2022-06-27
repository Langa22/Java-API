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
    public String getEmployees(@PathVariable("id") Long id){
        return "Fetching the information for id number "+id;
    }
    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return "Saving the employee details to the database "+employee;
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        System.out.println("Updating the employee data for the id "+id);
        return employee;
    }
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id){
        return "Deleting the employee details for the id "+id;
    }
}
