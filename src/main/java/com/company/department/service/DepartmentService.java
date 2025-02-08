package com.company.department.service;

import com.company.department.entity.Department;

import java.util.List;

/**
 * @author : gschamika
 */
public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);

    List<Department> getAllDepartments();
}
