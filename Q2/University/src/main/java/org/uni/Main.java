package org.uni;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // create Department object
        Department department = new Department("IT");

        // create Program objects and add them to department
        Program program1 = new Program("Computer Science");
        department.addProgram(program1);

        // create Teacher and Student objects
        Teacher teacher1 = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
        Student student1 = new Student("Viraj", "vj@uwindsor.ca", "MAC001");

        // create Course objects and add them to programs
        Course course1 = new Course("Software Engineering","SE001","Module for 3rd year", teacher1);
        program1.addCourse(course1);
        course1.addStudent(student1);

        // create LaboratoryAssignment, Quiz, and Exam objects and add them to Course
        LabAssignment lab1 = new LabAssignment("Lab1","SE Lab 1", new Date(), course1);
        Quiz quiz1 = new Quiz("Quiz1","Quiz for SE", new Date(), course1);
        Exam exam1 = new Exam("Exam1","Exam for SE", new Date(), course1);
        course1.addLabAssignment(lab1);
        course1.addQuiz(quiz1);
        course1.addExam(exam1);

        // print out information about the department, programs, courses, teachers, and students
        System.out.println("Department: " + department.getName());
        System.out.println("Programs: " + department.getPrograms().get(0).getName());
        System.out.println("Courses: " + program1.getCourses().get(0).getName());
        System.out.println("Teacher: " + teacher1.getName());
        System.out.println("Students: " + course1.getStudents().get(0).getName());
        System.out.println("Assignment: " + course1.getAssignments().get(0).getTitle());
        System.out.println("Quiz: " + course1.getQuizzes().get(0).getTitle());
        System.out.println("Exam: " + course1.getExams().get(0).getTitle());
    }

}