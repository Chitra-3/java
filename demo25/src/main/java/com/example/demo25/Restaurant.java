package com.example.demo25;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="restaurant_tbl")
public class Restaurant {
@Id
@Column(name="pid")
private int pid;
public int getPid() {
    return pid;
}


public void setPid(int pid) {
    this.pid = pid;
}

@Column(name="p_name")
private String p_name;

@Column(name="f_item")
private String f_item;

@Column(name="bill")
private double bill;



public Restaurant() {
}


public Restaurant(int pid, String p_name, String f_item, double bill) {
    this.pid = pid;
    this.p_name = p_name;
    this.f_item = f_item;
    this.bill = bill;
}



public String getP_name() {
    return p_name;
}

public void setP_name(String p_name) {
    this.p_name = p_name;
}

public String getF_item() {
    return f_item;
}

public void setF_item(String f_item) {
    this.f_item = f_item;
}

public double getBill() {
    return bill;
}

public void setBill(double bill) {
    this.bill = bill;
}

}
