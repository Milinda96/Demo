package com.industry.project.repository;

import com.industry.project.model.Course;
import com.industry.project.model.CourseId;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.support.Repositories;

public interface CourseRepository extends Repository<Course, CourseId> {
    Course findByCourseNameAndPeriodAndDepartmentName(String name,Integer period,String departmentname );
}
