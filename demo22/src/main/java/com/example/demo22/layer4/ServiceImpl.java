package com.example.demo22.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo22.layer2.Employee;
import com.example.demo22.layer3.EmployeeRepository;

@Service
public class ServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    
    @Override
    public Employee addRecord(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateRecord(int id, Employee updateEmployee) {
        Employee employee= employeeRepository.findById(id);
        if(updateEmployee.getEmp_name()!=null){
         employee.setEmp_name(updateEmployee.getEmp_name());
        }
        if(updateEmployee.getEmp_dept()!=null){
            employee.setEmp_dept(updateEmployee.getEmp_dept());
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee selectRecord(int id) {
       return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> selectAllRecords() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteRecord(int id) {
        employeeRepository.deleteById(id);
    }
    
    
}
