package com.noofProjects1.Springbootproject.service;

import com.noofProjects1.Springbootproject.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

  public   List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

  public   void deleteDepartmentById(Long departmentId);

  public  Department updateDepartment(Long depatmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
