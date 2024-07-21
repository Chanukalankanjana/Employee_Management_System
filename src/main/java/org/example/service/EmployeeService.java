package org.example.service;

import org.example.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void AddEmployee(Employee employee);
    List<Employee> getAll();
}
