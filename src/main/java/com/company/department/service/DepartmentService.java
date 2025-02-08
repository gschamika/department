package com.company.department.service;

import com.company.department.entity.Department;

import java.util.List;
import java.util.Optional;

/**
 * @author : gschamika
 */
public interface DepartmentService {
    Department saveDepartment(Department department);

    Optional<Department> getDepartmentById(Long id);

    List<Department> getAllDepartments();
}
