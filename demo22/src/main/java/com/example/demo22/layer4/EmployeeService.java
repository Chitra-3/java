package com.example.demo22.layer4;

import java.util.List;

import com.example.demo22.layer2.Employee;

public interface EmployeeService {
    Employee addRecord(Employee employee);
    Employee updateRecord(int id,Employee employee);
    Employee selectRecord(int id);
    List <Employee> selectAllRecords();
    void deleteRecord(int id);
} 
