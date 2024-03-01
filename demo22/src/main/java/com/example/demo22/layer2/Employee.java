package com.example.demo22.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="em_tbl")
public class Employee {
@Id
@Column(name="em_id")
private int emp_id;

@Column(name="em_name")
private String emp_name;

@Column(name="em_dept")
private String emp_dept;

public Employee(int emp_id, String emp_name, String emp_dept) {
    this.emp_id = emp_id;
    this.emp_name = emp_name;
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

public String getEmp_dept() {
    return emp_dept;
}

public void setEmp_dept(String emp_dept) {
    this.emp_dept = emp_dept;
}

}
