package com.first.training.repository;

import com.first.training.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeerepository extends JpaRepository<employee,String> {
}
