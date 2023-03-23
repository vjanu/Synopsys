package org.uni;

import java.util.Date;

public class LabAssignment {
    //attributes
    private String title;
    private String description;
    private Date dueDate;
    private Course course;
    private int marks;

    //constructors
    public LabAssignment(){}
    public LabAssignment(String title, String description, Date dueDate, Course course) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.course = course;
    }

    //methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

