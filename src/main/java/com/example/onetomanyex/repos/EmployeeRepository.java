package com.example.onetomanyex.repos;

import com.example.onetomanyex.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}