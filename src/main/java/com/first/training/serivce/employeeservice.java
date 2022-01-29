package com.first.training.serivce;

import com.first.training.model.employee;
import com.first.training.repository.employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class employeeservice {
    @Autowired
    employeerepository employeerepository;

    public List<employee> getemployee(){
        return employeerepository.findAll();

    }
    public String saveempployee(employee employee){
        if(employeerepository.existsById(employee.getId())){
            return "Couldn'tsave data";
        }
        else{
            employeerepository.save(employee);
            return "employeee data  success";
        }
    }


}
