package com.infy.practice.realm;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



//Control Layel --> request fetch and response send

@RestController
public class EmpController {

    //List<Employee> employees = new ArrayList<>();       //class level list creation
   
    //EmployeeService employeeService = new EmployeeServiceImplement();                       

    @Autowired                                    //@autowired -> marks dependency injection
    EmployeeService employeeService;              //dependency injection --> letting IOC do work at the back -> creates a object for you

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {

        return employeeService.readEmployees();             
        // List<Employee> employees = new ArrayList<>();
        // Employee emp = new Employee();
        // emp.setName("Richik");
        // employees.add(null);
        // employees.add(emp);
    }

    @GetMapping("employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.readEmployee(id);
    }
    
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        //employees.add(employee); --> job for service
        return employeeService.createEmployee(employee);
        //return "Saved successfully";
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if(employeeService.deleteEmployee(id))
            return "Deleted successfully";
        return "Employee not found";
    }

    @PutMapping("employee/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
}
