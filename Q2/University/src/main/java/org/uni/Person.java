package org.uni;

public class Person {
    //attributes
    private String name;
    private String email;
    private String id;

    //constructors
    public Person(){}
    public Person(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
