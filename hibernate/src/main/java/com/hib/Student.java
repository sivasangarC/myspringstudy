package com.hib;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.*;
@Entity  // Marks this class as a JPA entity — Hibernate will create a "Student" table for it
public class Student {
    @Id  // Marks 'rollno' as the primary key column in the Student table
    private int rollno;
    private String sname;
    private int sage;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                '}';
    }
}
