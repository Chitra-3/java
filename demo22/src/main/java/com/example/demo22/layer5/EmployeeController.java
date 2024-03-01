package com.example.demo22.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo22.layer2.Employee;
import com.example.demo22.layer4.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    
    @PostMapping("/add")
    public Employee addRecord(@RequestBody Employee employee) {
        return employeeService.addRecord(employee);
    }
    @PutMapping("/update/{id}")
    public Employee updateRecord(@PathVariable int id, @RequestBody Employee updateEmployee) {
        return employeeService.updateRecord(id,updateEmployee);
    }

    @GetMapping("/getRecord/{id}")
    public Employee selectRecord(@PathVariable int id) {
        return employeeService.selectRecord(id);
     }

     @GetMapping("/getAllRecords")
     public List<Employee> selectAllRecords() {
        return employeeService.selectAllRecords();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRecord(@PathVariable int id) {
        employeeService.deleteRecord(id);
    }
}
