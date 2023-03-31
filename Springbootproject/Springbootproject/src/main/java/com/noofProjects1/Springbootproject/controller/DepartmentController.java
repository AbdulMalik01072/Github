package com.noofProjects1.Springbootproject.controller;

import com.noofProjects1.Springbootproject.entity.Department;
import com.noofProjects1.Springbootproject.service.DepartmentService;
import com.noofProjects1.Springbootproject.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    private final Logger LOGGER=
         LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of  DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of  DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")
        public String deleteDepartmentById (@PathVariable("id") Long departmentId){

            departmentService.deleteDepartmentById(departmentId);
            return "Department deleted Successfully!!";

        }
        @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long depatmentId,
                                       @RequestBody Department department){
        return departmentService. updateDepartment(depatmentId,department);
    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
