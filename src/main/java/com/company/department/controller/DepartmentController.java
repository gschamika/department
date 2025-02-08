package com.company.department.controller;

import com.company.department.entity.Department;
import com.company.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author : gschamika
 */
@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping //save department
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.saveDepartment(department));
    }

    @GetMapping("/{id}") //get department by id
    public ResponseEntity<Optional<Department>> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    @GetMapping //get all departments
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

}
