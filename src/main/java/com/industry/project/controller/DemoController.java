package com.industry.project.controller;

import com.industry.project.model.Course;
import com.industry.project.model.Department;
import com.industry.project.model.Student;
import com.industry.project.service.impl.CourseService;
import com.industry.project.service.impl.DepartmentService;
import com.industry.project.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    StudentService studentService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    CourseService courseService;

    @RequestMapping("/students/{id}")
    public Student getStudent(){
        Student student= studentService.getStudent("Bhagya","2nd");
        return student;
    }
    @RequestMapping("departments/{id}")
    public Department getDepartment(){
        Department department=departmentService.getDepartment("rnd","kaluthara");
        return department;
    }
    @RequestMapping("/courses/{id}/")
    public Course getCourse(){
        Course course=courseService.getCourse("IN2200", 2);
        return course;
    }
}
