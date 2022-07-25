package com.example.onetomanyex.controller;

import com.example.onetomanyex.entities.Employee;
import com.example.onetomanyex.repos.AddressRepository;
import com.example.onetomanyex.repos.EmployeeRepository;
import com.example.onetomanyex.web.FullEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;



    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestParam int age, @RequestParam String name){
        Employee employee = new Employee();
        employee.setEmpage(age);
        employee.setEmpname(name);
        employeeRepository.save(employee);
        return ResponseEntity.ok("SAVED");
    }
    @PostMapping("/saveEmployeesbody")
    public ResponseEntity<String> saveEmployeesBody(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return ResponseEntity.ok("SAVED (requestbody) ");
    }

    @PostMapping("/saveFullEmpInfo")
    public ResponseEntity<String> saveFullEmployee(@RequestBody FullEmployee fullEmployee){
        employeeRepository.save(fullEmployee.getEmployee());
        addressRepository.save(fullEmployee.getAddress());
        return ResponseEntity.ok("Saved full employee");
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
}
