package com.example.onetomanyex.web;

import com.example.onetomanyex.entities.Address;
import com.example.onetomanyex.entities.Employee;

public class FullEmployee {
    private Employee employee;
    private Address address;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
