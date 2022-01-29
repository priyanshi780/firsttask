package com.first.training.controller;

import com.first.training.model.employee;
import com.first.training.repository.employeerepository;
import com.first.training.serivce.employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class employeecontroller {
    @Autowired
    employeeservice employeeservice;
    @GetMapping("/employee")
    public List<employee> getemployee(){
        List<employee> employeeList=employeeservice.getemployee();
        return employeeList;

}   @PostMapping("/addemp")
    public String saveemployee(@RequestBody  employee employee){
        return employeeservice.saveempployee(employee);
    }
}
