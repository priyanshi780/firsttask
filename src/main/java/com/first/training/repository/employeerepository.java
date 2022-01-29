package com.first.training.repository;

import com.first.training.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employeerepository extends JpaRepository<employee,String> {
    List<employee> findAllByCity(String city);

}
