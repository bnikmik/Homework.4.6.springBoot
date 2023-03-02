package com.example.springboot.service;

import com.example.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);

    Employee getEmployeeById(int id);

    List<Employee> getEmployees();

    void updateEmployee(Employee employee);

    void deleteEmployeeById(int id);
}
