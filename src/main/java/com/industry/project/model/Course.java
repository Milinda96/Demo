package com.industry.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Course")
@IdClass(CourseId.class)
public class Course{

 private List<Student> students=new ArrayList<Student>();
    
    @Id
    @Column(name="CourseName")
    private String courseName;

    @Id
    @Column(name="Period")
    private Integer period;

    @Id
    @Column(name="DepartmentName")
    private String departmentName;

    @ManyToOne
        @JoinColumns({
                @JoinColumn(name="Department", referencedColumnName="departmentName",insertable = false,updatable = false),
                @JoinColumn(name="DepartmentLocation", referencedColumnName="departmentLocation",insertable = false,updatable = false),
        })
     @JsonIgnore
     private Department department;

      public String getCourseName(){
          return courseName;
        }
      public void setCourseName(String name){
          this.courseName=name;
        }
        public int getPeriod(){
        return period;
        }
       public void setPeriod(int period){
        this.period=period;
        }
    @ManyToMany
    @JoinTable(name="Student_Course",
            joinColumns ={@JoinColumn(name="CourseId")},
            inverseJoinColumns = {@JoinColumn(name="StudentId")})
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
   
