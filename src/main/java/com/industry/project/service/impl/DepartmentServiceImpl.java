package com.industry.project.service.impl;

import com.industry.project.model.Department;
import com.industry.project.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department getDepartment(String rnD, String kalutara) {
        return departmentRepository.findByNameAndLocation("rnd","kalutara");
    }
}
