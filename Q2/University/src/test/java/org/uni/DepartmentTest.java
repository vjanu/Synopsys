package org.uni;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DepartmentTest {

    private Department department;

    @Before
    public void setUp() throws Exception {
        department = new Department("Computer Science");
    }

    @Test
    public void testGetName() {
        assertEquals("Computer Science", department.getName());
    }

    @Test
    public void testAddProgram() {
        Program program1 = new Program("Bachelor of Science in Computer Science");
        Program program2 = new Program("Master of Science in Computer Science");
        department.addProgram(program1);
        department.addProgram(program2);
        List<Program> programs = department.getPrograms();
        assertEquals(2, programs.size());
        assertTrue(programs.contains(program1));
        assertTrue(programs.contains(program2));
    }

    @Test
    public void testRemoveProgram() {
        Program program1 = new Program("Bachelor of Science in Computer Science");
        Program program2 = new Program("Master of Science in Computer Science");
        department.addProgram(program1);
        department.addProgram(program2);
        List<Program> programs = department.getPrograms();
        assertEquals(2, programs.size());
        department.removeProgram(program1);
        programs = department.getPrograms();
        assertEquals(1, programs.size());
        assertFalse(programs.contains(program1));
        assertTrue(programs.contains(program2));
    }
}

