package org.uni;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProgramTest {

    private Program program;
    private Teacher teacher;

    @Before
    public void setUp() throws Exception {
        program = new Program("Bachelor of Science in Computer Science");
        teacher = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
    }

    @Test
    public void testGetName() {
        assertEquals("Bachelor of Science in Computer Science", program.getName());
    }

    @Test
    public void testAddCourse() {
        Course course1 = new Course("Software Engineering","SE001","Module for 3rd year", teacher);
        program.addCourse(course1);
        List<Course> courses = program.getCourses();
        assertEquals(1, courses.size());
        assertTrue(courses.contains(course1));
    }

    @Test
    public void testRemoveCourse() {
        Course course1 = new Course("Software Engineering","SE001","Module for 3rd year", teacher);
        Course course2 = new Course("Database Topics ","DB001","Module for 1st year", teacher);
        program.addCourse(course1);
        program.addCourse(course2);
        List<Course> courses = program.getCourses();
        assertEquals(2, courses.size());
        program.removeCourse(course1);
        courses = program.getCourses();
        assertEquals(1, courses.size());
        assertFalse(courses.contains(course1));
        assertTrue(courses.contains(course2));
    }
}
