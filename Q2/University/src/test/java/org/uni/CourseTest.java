package org.uni;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CourseTest {

    private Course course;
    private Teacher teacher;
    private Student student;
    private LabAssignment assignment;
    private Quiz quiz;
    private Exam exam;

    @Before
    public void setUp() {
        teacher = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
        student = new Student("Viraj", "vj@uwindsor.ca", "MAC001");
        course = new Course("Programming for Beginners", "MAC342", "Introduction to programming", teacher);
        assignment = new LabAssignment("Lab1","SE Lab 1", new Date(), course);
        quiz = new Quiz("Quiz1","Quiz for SE", new Date(), course);
        exam = new Exam("Exam1","Exam for SE", new Date(), course);
    }

    @Test
    public void testAddStudent() {
        course.addStudent(student);
        assertTrue(course.getStudents().contains(student));
    }

    @Test
    public void testRemoveStudent() {
        course.addStudent(student);
        course.removeStudent(student);
        assertFalse(course.getStudents().contains(student));
    }

    @Test
    public void testAddLabAssignment() {
        course.addLabAssignment(assignment);
        assertTrue(course.getAssignments().contains(assignment));
    }

    @Test
    public void testAddQuiz() {
        course.addQuiz(quiz);
        assertTrue(course.getQuizzes().contains(quiz));
    }

    @Test
    public void testAddExam() {
        course.addExam(exam);
        assertTrue(course.getExams().contains(exam));
    }

    @Test
    public void testGetName() {
        assertEquals("Programming for Beginners", course.getName());
    }

    @Test
    public void testGetTeacher() {
        assertEquals(teacher, course.getTeacher());
    }
}
