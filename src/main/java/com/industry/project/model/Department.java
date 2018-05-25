package com.industry.project.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="Department")
@IdClass(DepartmentId.class)
public class Department {

    @Id
    @Column(name="DepartmentName")
    private String departmentName;

    @Id
    @Column(name="DepartmentLocation")
    private Integer departmentLocation;

    @Id
    @Column(name="CourseNumber")
    private Integer courseNumber;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "department")
    private Set<Course> courses;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String name) {
        this.departmentName = name;
    }

    public Integer getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(Integer departmentLocation) {
        this.departmentLocation = departmentLocation;
    }

    public Integer getcourseNumber() {
        return courseNumber;
    }

    public void setcourseNumber(Integer studentNumber) {
        this.courseNumber = studentNumber;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setStudents(Set<Course> courses) {
        this.courses = courses;
    }
}
