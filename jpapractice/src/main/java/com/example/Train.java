package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Train_tbl")

public class Train {

@Id
@Column(name="train_id")
private int id;

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}



@Column(name = "train_name")
private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

@Column(name = "ticket_price")
private double price;

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

@Column(name = "source")
private String source;

public String getSource() {
    return source;
}

public void setSource(String source) {
    this.source = source;
}

@Column(name = "destination")
private String destination;

// public Train(int id, String name, double price, String source, String destination) {
//     this.id = id;
//     this.name = name;
//     this.price = price;
//     this.source = source;
//     this.destination = destination;
// }

public Train() {
}

public String getDestination() {
    return destination;
}

public void setDestination(String destination) {
    this.destination = destination;
}
}
