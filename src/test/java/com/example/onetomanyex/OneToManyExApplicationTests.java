package com.example.onetomanyex;

import com.example.onetomanyex.entities.Employee;
import com.example.onetomanyex.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyExApplicationTests {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void contextLoads() {
        Employee employee = new Employee();
        employee.setEmpname("joe");
        employee.setEmpage(23);
        repository.save(employee);

    }

}
