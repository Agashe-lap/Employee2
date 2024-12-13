package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public Employee add(Employee obj) {
        return empRepo.save(obj);
    }

    @Override
    public List<Employee> getAll() {
        // TODO Auto-generated method stub
        return empRepo.findAll();
    }

}
