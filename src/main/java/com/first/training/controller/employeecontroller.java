package com.first.training.controller;

import com.first.training.model.employee;
import com.first.training.repository.employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class employeecontroller {
    @Autowired
    employeerepository employeerepository;
    @GetMapping("/employee")

    public List<employee> getemployees(){
        List<employee> employeeList=employeerepository.findAll();
        return employeeList;
    }
    @PostMapping("/employee")
}
