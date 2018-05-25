package com.industry.project.repository;

import com.industry.project.model.Student;
import com.industry.project.model.StudentId;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends Repository<Student, StudentId> {
    Student findByStudentNameAndyear(String bhagya, String  sa );
}
