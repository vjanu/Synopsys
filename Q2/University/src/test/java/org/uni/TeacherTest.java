package org.uni;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test
    public void testConstructor() {
        Teacher teacher = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
        assertEquals("John", teacher.getName());
        assertEquals("john@uwindsor.ca", teacher.getEmail());
        assertEquals("PRO002", teacher.getId());
        assertEquals("IT", teacher.getDepartment());
    }

    @Test
    public void testDepartment() {
        Teacher teacher = new Teacher();
        teacher.setDepartment("CS");
        assertEquals("CS", teacher.getDepartment());
    }
}
