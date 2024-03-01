package com.example.demo24.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_tbl")
public class Patient {
   
@Id
@Column(name="p_id")
private int pId;

@Column(name="p_name")
private String pName;

@Column(name="p_age")
private int pAge;

@Column(name="treatment")
private String treatment;

@Column(name="bill")
private double bill;

public Patient(int pId, String pName, int pAge, String treatment, double bill) {
    this.pId = pId;
    this.pName = pName;
    this.pAge = pAge;
    this.treatment = treatment;
    this.bill = bill;
}

public Patient() {
}

public int getpId() {
    return pId;
}

public void setpId(int pId) {
    this.pId = pId;
}

public String getpName() {
    return pName;
}

public void setpName(String pName) {
    this.pName = pName;
}

public int getpAge() {
    return pAge;
}

public void setpAge(int pAge) {
    this.pAge = pAge;
}

public String getTreatment() {
    return treatment;
}

public void setTreatment(String treatment) {
    this.treatment = treatment;
}

public double getBill() {
    return bill;
}

public void setBill(double bill) {
    this.bill = bill;
}

}






