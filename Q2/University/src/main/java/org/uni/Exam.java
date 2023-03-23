package org.uni;

import java.util.Date;

public class Exam {
    //attributes
    private String title;
    private String description;
    private Date dateTime;
    private Course course;
    private int marks;

    //constructors
    public Exam(){}
    public Exam(String title, String description, Date dateTime, Course course) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
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

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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
