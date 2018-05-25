package com.industry.project.service.impl;

import com.industry.project.model.Course;
import com.industry.project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course getCourse(String IN2200, Integer num,String departmentname) {
        return  courseRepository.findByCourseNameAndPeriodAndDepartmentName("IN2200",2,"it");
    }
}
