package com.noofProjects1.Springbootproject.service;

import com.noofProjects1.Springbootproject.entity.Department;
import com.noofProjects1.Springbootproject.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
     Department fetchDepartmentByName(String departmentName);
    Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long depatmentId, Department department);

}

