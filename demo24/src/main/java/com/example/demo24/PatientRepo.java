package com.example.demo24;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo24.pojo.Patient;



public interface PatientRepo  extends CrudRepository <Patient,Integer>{
    Patient findById(int id);
    List<Patient> findAll();
}
