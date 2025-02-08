package com.company.department.service;

import com.company.department.entity.Department;
import com.company.department.exception.ResourceNotFoundException;
import com.company.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author : gschamika
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    public static final String DEPARTMENT_NOT_FOUND = "Department not found with ID: ";

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long id) {
        Optional<Department> department =  departmentRepository.findById(id);
        if (department.isPresent()) {
            return department.get();
        } else {
            throw new ResourceNotFoundException(DEPARTMENT_NOT_FOUND + id);
        }
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
