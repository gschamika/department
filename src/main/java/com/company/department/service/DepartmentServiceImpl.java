package com.company.department.service;

import com.company.department.entity.Department;
import com.company.department.exception.DepProjectException;
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
        try {
            return departmentRepository.save(department);
        } catch (Exception e) {
            throw new DepProjectException("Error creating department", e);
        }
    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        try {
            return Optional.ofNullable(departmentRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException(DEPARTMENT_NOT_FOUND + id)));
        } catch (ResourceNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new DepProjectException("Error retrieving department", e);
        }
    }

    @Override
    public List<Department> getAllDepartments() {
        try {
            return departmentRepository.findAll();
        } catch (Exception e) {
            throw new DepProjectException("Error retrieving department", e);
        }
    }
}
