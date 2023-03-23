package org.uni;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructor() {
        Student student = new Student("Viraj", "vj@uwindsor.ca", "MAC001");
        assertEquals("Viraj", student.getName());
        assertEquals("vj@uwindsor.ca", student.getEmail());
        assertEquals("MAC001", student.getId());
        assertEquals(0, student.getCourses().size());
    }

    @Test
    public void testAddAndRemoveCourse() {
        Student student = new Student("Viraj", "vj@uwindsor.ca", "MAC001");
        Teacher teacher = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
        Course course = new Course("Software Engineering","SE001","Module for 3rd year", teacher);

        student.addCourse(course);

        assertEquals(1, student.getCourses().size());
        assertTrue(student.getCourses().contains(course));

        student.removeCourse(course);

        assertEquals(0, student.getCourses().size());
        assertFalse(student.getCourses().contains(course));
    }
}
