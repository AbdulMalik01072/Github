package com.NoofProjects2.Employee.services;

import com.NoofProjects2.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
