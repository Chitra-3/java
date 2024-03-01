package com.example.demo24;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo24.pojo.Patient;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

@PostMapping("/add")
Patient addPatient(@RequestBody Patient patient){
    return patientService.addPatient(patient);
}

@PutMapping("/update/{id}")
Patient updatePatient(@PathVariable int id,@RequestBody Patient oldPatient){
    return patientService.updatePatient(id, oldPatient);
}
@GetMapping("/viewAll")
List<Patient> viewAllPatients(){
    return patientService.viewAllPatients();
}
@GetMapping("/{id}")
Patient viewPatient(@PathVariable int id){
    return patientService.viewPatient(id);
}
@DeleteMapping("/delete/{id}")
void deletePatient(@PathVariable int id){
    patientService.deletePatient(id);
}
}

