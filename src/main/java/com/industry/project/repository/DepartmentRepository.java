package com.industry.project.repository;

import com.industry.project.model.Department;
import com.industry.project.model.DepartmentId;
import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends Repository<Department,DepartmentId>{
    Department findByNameAndLocation(String name ,String location);
}
