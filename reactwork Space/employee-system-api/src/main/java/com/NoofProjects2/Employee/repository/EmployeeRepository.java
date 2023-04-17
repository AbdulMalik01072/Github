package com.NoofProjects2.Employee.repository;

import com.NoofProjects2.Employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Long> {
}
