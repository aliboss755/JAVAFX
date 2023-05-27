package com.example.javefx.Users;

import java.io.Serializable;

public class Student extends Users implements Serializable {
    private int universityId ;

    public Student(String userName , String password , String name , int universityId,String birthday , String gender ) {
        super ( userName , password , name , birthday , gender );
        this.universityId = universityId;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    @Override
    public String toString() {
        return  "userName='" + super.getUserName () + '\'' +
                ", password='" + super.getPassword () + '\'' +
                ", name='" + super.getName () + '\'' +
                ", birthday='" + super.getBirthday () + '\'' +
                ", gender='" + super.getGender () + '\'' +"\t"+
                "universityId=" + universityId +

                '}';
    }

}
