package com.industry.project.service.impl;

import com.industry.project.model.Student;
import com.industry.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SudentServiceImpl  implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(String sanka, String year) {
        return studentRepository.findByStudentNameAndyear("sanka","2nd");
    }
}
