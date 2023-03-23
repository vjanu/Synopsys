package org.uni;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class LabAssignmentTest {
    private Teacher teacher;
    private Course course;
    private LabAssignment labAssignment;
    private Calendar calendar;
    private Date dueDate;
    @Before
    public void setUp() throws Exception {
        teacher = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
        course = new Course("Software Engineering","SE001","Module for 3rd year", teacher);
        calendar = Calendar.getInstance();
        calendar.set(2023, 3, 21);
        dueDate = calendar.getTime();
        labAssignment = new LabAssignment("Lab 1", "Description", dueDate, course);
    }

    @Test
    public void testConstructor() {
        assertEquals("Lab 1", labAssignment.getTitle());
        assertEquals("Description", labAssignment.getDescription());
        assertEquals(dueDate, labAssignment.getDueDate());
        assertEquals(course, labAssignment.getCourse());
        assertEquals(0, labAssignment.getMarks());
    }

    @Test
    public void testGettersAndSetters() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, 3, 21);
        Date dueDate = calendar.getTime();

        labAssignment.setTitle("Lab 2");
        labAssignment.setDescription("New description");
        labAssignment.setDueDate(calendar.getTime());

        Course newCourse = new Course("English","SE001","Module for 3rd year", teacher);
        labAssignment.setCourse(newCourse);
        labAssignment.setMarks(10);

        assertEquals("Lab 2", labAssignment.getTitle());
        assertEquals("New description", labAssignment.getDescription());
        assertEquals(calendar.getTime(), labAssignment.getDueDate());
        assertEquals(newCourse, labAssignment.getCourse());
        assertEquals(10, labAssignment.getMarks());
    }
}
