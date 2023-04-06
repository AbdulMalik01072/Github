package com.noofProjects1.Springbootproject.service;

import com.noofProjects1.Springbootproject.entity.Department;
import com.noofProjects1.Springbootproject.repository.DepartmentRepository;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private  DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("Ahmedabad")
                        .departmentCode("IT-06")
                        .departmentId(1L)
                        .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("Get Data based on Valid Department Name")
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "IT";
        Department found=
                departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}