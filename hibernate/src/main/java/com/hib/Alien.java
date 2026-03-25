package com.hib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity  // Marks this class as a JPA entity — Hibernate will create an "Alien" table for it
public class Alien {
    @Id  // Marks 'aid' as the primary key column in the Alien table
    private int aid;
    private  String aname;
    private String tech;
    @OneToOne  // Creates a foreign key in Alien table pointing to Laptop table (one alien owns one laptop)
    private Laptop laptop;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
