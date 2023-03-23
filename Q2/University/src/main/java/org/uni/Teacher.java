package org.uni;

public class Teacher extends Person {
    //attributes
    private String department;

    //constructors
    public Teacher(){}
    public Teacher(String name, String email, String id, String department) {
        super(name, email, id);
        this.department = department;
    }

    //methods
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

