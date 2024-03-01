package com.example.demo24;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo24.pojo.Patient;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    PatientRepo patientRepo;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
        
    }

    @Override
    public Patient updatePatient(int id,Patient oldPatient) {
        Patient newPatient=patientRepo.findById(id);
        if(oldPatient.getpAge()!=0|| oldPatient.getTreatment()!=null){
            newPatient.setTreatment(oldPatient.getTreatment());
            newPatient.setpAge(oldPatient.getpAge());
        }
        return patientRepo.save(newPatient);
        
    }

    @Override
    public Patient viewPatient(int id) {
      return patientRepo.findById(id);
    }

    @Override
    public List<Patient> viewAllPatients() {
      return patientRepo.findAll();
    }

    @Override
    public void deletePatient(int id) {
        patientRepo.deleteById(id);
    }


}
