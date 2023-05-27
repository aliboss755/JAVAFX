package com.example.javefx.Users;

import java.io.Serializable;

public class Teacher extends Users implements Serializable {
    private double salary;
    private String filed;

    public Teacher(String userName , String password , String name , String birthday , String gender , double salary , String filed) {
        super ( userName , password , name , birthday , gender );
        this.salary = salary;
        this.filed = filed;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    @Override
    public String toString() {
        return  "userName='" + super.getUserName () + '\'' +
                ", password='" + super.getPassword () + '\'' +
                ", name='" + super.getName () + '\'' +
                ", birthday='" + super.getBirthday () + '\'' +
                ", gender='" + super.getGender () + '\'' +
                "\tsalary = " +this.salary + '\'' + "\tfiled = " + filed+
                '}';
    }
}
