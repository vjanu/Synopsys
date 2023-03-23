package org.uni;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    //attributes
    private List<Course> courses;

    //constructors
    public Student(){}
    public Student(String name, String email, String id) {
        super(name, email, id);
        courses = new ArrayList<Course>();
    }

    //methods
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
