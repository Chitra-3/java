package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
@Id
@Column(name="std_id")
private int studentId;


@Column(name="std_name")
private String studentName;

@Column(name="std_age")
private int studentAge;

@Column(name="std_dept")
private String studentDept;



public Student(int studentId, String studentName, int studentAge, String studentDept) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.studentAge = studentAge;
    this.studentDept = studentDept;
}

public Student() {
}

public int getStudentId() {
    return studentId;
}

public void setStudentId(int studentId) {
    this.studentId = studentId;
}

public String getStudentName() {
    return studentName;
}

public void setStudentName(String studentName) {
    this.studentName = studentName;
}

public int getStudentAge() {
    return studentAge;
}

public void setStudentAge(int studentAge) {
    this.studentAge = studentAge;
}

public String getStudentDept() {
    return studentDept;
}

public void setStudentDept(String studentDept) {
    this.studentDept = studentDept;
}

}
