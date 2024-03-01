package com.example.demo24;

import java.util.List;

import com.example.demo24.pojo.Patient;

public interface PatientService {
Patient addPatient(Patient patient);
Patient updatePatient(int id,Patient newPatient);
Patient viewPatient(int id);
List<Patient> viewAllPatients();
void deletePatient(int id);

} 
