package com.NoofProjects2.Employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private long id;
    private String firstName;
    private  String LastName;
    private String emailId;

}
