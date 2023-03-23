package org.uni;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class ExamTest {
    private Exam exam;
    private Teacher teacher;

    @Before
    public void setUp() throws Exception {
        teacher = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
        Course course = new Course("Java Programming","SE001","Module for 3rd year", teacher);
        exam = new Exam("Practical Exam", "New exam for CS students", new Date(), course);
    }

    @Test
    public void testGetTitle() {
        assertNotNull(exam.getTitle());
        assertEquals("Practical Exam", exam.getTitle());
    }

    @Test
    public void testSetTitle() {
        exam.setTitle("Final Exam");
        assertNotNull(exam.getTitle());
        assertEquals("Final Exam", exam.getTitle());
    }

    @Test
    public void testGetDescription() {
        assertNotNull(exam.getDescription());
        assertEquals("New exam for CS students", exam.getDescription());
    }

    @Test
    public void testSetDescription() {
        exam.setDescription("A final exam for the Java Programming course");
        assertNotNull(exam.getDescription());
        assertEquals("A final exam for the Java Programming course", exam.getDescription());
    }

    @Test
    public void testGetDateTime() {
        assertNotNull(exam.getDateTime());
    }

    @Test
    public void testSetDateTime() {
        Date newDate = new Date();
        exam.setDateTime(newDate);
        assertNotNull(exam.getDateTime());
        assertEquals(newDate, exam.getDateTime());
    }

    @Test
    public void testGetCourse() {
        assertNotNull(exam.getCourse());
        assertEquals("Java Programming", exam.getCourse().getName());
    }

    @Test
    public void testSetCourse() {
        Course newCourse = new Course("Database Systems","SE001","Module for 3rd year", teacher);
        exam.setCourse(newCourse);
        assertNotNull(exam.getCourse());
        assertEquals("Database Systems", exam.getCourse().getName());
    }

    @Test
    public void testGetMarks() {
        assertEquals(0, exam.getMarks());
    }

    @Test
    public void testSetMarks() {
        exam.setMarks(99);
        assertEquals(99, exam.getMarks());
    }
}
