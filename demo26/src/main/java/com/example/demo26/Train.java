package com.example.demo26;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="train_table2")
public class Train {
@Id
@Column(name="tid")
private int tid;

@Column(name="tname")
private String tname;

@Column(name = "src")
private String src;

@Column(name = "dest")
private String dest;

public Train() {
}
public Train(int tid, String tname, String src, String dest) {
    this.tid = tid;
    this.tname = tname;
    this.src = src;
    this.dest = dest;
}

public int getTid() {
    return tid;
}

public void setTid(int tid) {
    this.tid = tid;
}

public String getTname() {
    return tname;
}

public void setTname(String tname) {
    this.tname = tname;
}

public String getSrc() {
    return src;
}

public void setSrc(String src) {
    this.src = src;
}

public String getDest() {
    return dest;
}

public void setDest(String dest) {
    this.dest = dest;
}
}
