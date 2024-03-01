package com.example.demo20.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="accounts_table")
public class Account {
@Id
@Column(name="acNo")
private int acNo;

@Column(name="acHolder")
private String acHolder;

@Column(name="acBal")
private float acBal;

public Account(int acNo, String acHolder, float acBal) {
    this.acNo = acNo;
    this.acHolder = acHolder;
    this.acBal = acBal;
}

public Account() {
}

public int getAcNo() {
    return acNo;
}

public void setAcNo(int acNo) {
    this.acNo = acNo;
}

public String getAcHolder() {
    return acHolder;
}

public void setAcHolder(String acHolder) {
    this.acHolder = acHolder;
}

public float getAcBal() {
    return acBal;
}

public void setAcBal(float acBal) {
    this.acBal = acBal;
}
}
