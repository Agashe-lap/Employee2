package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @GetMapping("/display")
    public List<Employee> display() {
        return es.getAll();
    }
    @PostMapping("/add")
    public Employee add(@RequestBody Employee emp) {
        return es.add(emp);
    }
}
