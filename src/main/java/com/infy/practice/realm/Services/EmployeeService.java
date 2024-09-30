package com.infy.practice.realm.Services;

import java.util.List;

import com.infy.practice.realm.Employee;


//achieve abstruction
public interface EmployeeService {
    //CREATE
    String createEmployee(Employee employee);
    //READ
    List<Employee> readEmployees();
    Employee readEmployee(Long id);
    //DELETE
    boolean deleteEmployee(Long id);
    //UPDATE
    String updateEmployee(Long id, Employee employee);

    
}
