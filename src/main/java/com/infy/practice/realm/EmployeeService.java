package com.infy.practice.realm;

import java.util.List;


//achieve abstruction
public interface EmployeeService {

    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
    Employee readEmployee(Long id);
}
