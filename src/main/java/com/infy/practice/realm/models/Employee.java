package com.infy.practice.realm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String department;
    private String email;
    
}
