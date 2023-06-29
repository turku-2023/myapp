package com.example.myapp;

public class Person {
    public Person(String fn, String ln){
        fname=fn;
        lname=ln;
    }
    public Person(){}

    private String fname;
    private String lname;

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}