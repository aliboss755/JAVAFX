package com.example.javefx.Users;

public class Admin extends Users{
    private String department;
    public Admin(String userName , String password , String name , String birthday , String gender, String department) {
        super ( userName , password , name , birthday , gender );
        this.department=department;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return super.toString ( );
    }
}
