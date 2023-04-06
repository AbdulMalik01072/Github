package com.noofProjects1.Springbootproject.controller;

import com.noofProjects1.Springbootproject.entity.Department;
import com.noofProjects1.Springbootproject.error.DepartmentNotFoundException;
import com.noofProjects1.Springbootproject.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        department=Department.builder()
                .departmentAddress("Hyderabad")
                .departmentCode("IT-06")
                .departmentName("IT")
                .departmentId(1L)
                .build();
    }

    @Test
    void saveDepartment() throws Exception {
        Department inpudepartment = Department.builder()
                .departmentAddress("Hyderabad")
                .departmentCode("IT-06")
                .departmentName("IT")
                .build();
        Mockito.when(departmentService.saveDepartment(inpudepartment))
                .thenReturn(department);
        mockMvc.perform(post("/departments")
                 .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\t\"departmentName\":\"IT\",\n" +
                        "\t\"departmentAddress\":\"Hyderabad\",\n" +
                        "\t\"departmentCode\":\"IT-06\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    void fetchDepartmentById() throws DepartmentNotFoundException {
        Mockito.when(departmentService.fetchDepartmentById(1L))
                .thenReturn(department);
    }
}