package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees_tbl")
public class Employee {
@Id
@Column(name="emp_id")
private int emp_id;

@Column(name="emp_name")
private String emp_name;

@Column(name="emp_age")
private int emp_age;

@Column(name="emp_dept")
private String emp_dept;

public Employee(int emp_id, String emp_name, int emp_age, String emp_dept) {
    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.emp_age = emp_age;
    this.emp_dept = emp_dept;
}

public Employee() {
}

public int getEmp_id() {
    return emp_id;
}

public void setEmp_id(int emp_id) {
    this.emp_id = emp_id;
}

public String getEmp_name() {
    return emp_name;
}

public void setEmp_name(String emp_name) {
    this.emp_name = emp_name;
}

public int getEmp_age() {
    return emp_age;
}

public void setEmp_age(int emp_age) {
    this.emp_age = emp_age;
}

public String getEmp_dept() {
    return emp_dept;
}

public void setEmp_dept(String emp_dept) {
    this.emp_dept = emp_dept;
}
}
