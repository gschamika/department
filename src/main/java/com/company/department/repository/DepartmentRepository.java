package com.company.department.repository;

import com.company.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : gschamika
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
