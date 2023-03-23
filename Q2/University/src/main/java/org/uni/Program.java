package org.uni;

import java.util.ArrayList;
import java.util.List;

public class Program {
    //attributes
    private String name;
    private List<Course> courses;

    //constructors
    public Program() {}
    public Program(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    //methods
    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
