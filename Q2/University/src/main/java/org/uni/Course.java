package org.uni;

import java.util.ArrayList;
import java.util.List;

public class Course {
    //attributes
    private String name;
    private String code;
    private String description;
    private Teacher teacher;
    private List<Student> students;
    private List<LabAssignment> assignments;
    private List<Quiz> quizzes;
    private List<Exam> exams;

    //constructors
    public Course(){}
    public Course(String name, String code, String description, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.teacher = teacher;
        students = new ArrayList<>();
        assignments = new ArrayList<>();
        quizzes = new ArrayList<>();
        exams = new ArrayList<>();
    }

    //methods
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addLabAssignment(LabAssignment assignment) {
        assignments.add(assignment);
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<LabAssignment> getAssignments() {
        return assignments;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public List<Exam> getExams() {
        return exams;
    }
}
