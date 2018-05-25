package com.industry.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name= "Student")
@IdClass(StudentId.class)
public class Student{

    private List<Course> corses = new ArrayList<Course>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private int id;

    @Id
    @Column(name="Studentname")
    private String studentName;

    @Id
    @Column(name="Year")
    private String year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    @ManyToMany
    @JoinTable(name="Student_Course",
            joinColumns ={@JoinColumn(name="StudentId")},
            inverseJoinColumns = {@JoinColumn(name="CourseId")})

    public List<Course> getCorses() {
        return corses;
    }

    public void setCorses(List<Course> corses) {
        this.corses = corses;
    }
}

