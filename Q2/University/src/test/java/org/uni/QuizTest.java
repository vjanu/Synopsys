package org.uni;

import static org.junit.Assert.*;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import org.junit.Test;

public class QuizTest {

    @Test
    public void testConstructorAndGetters() {
        String title = "Quiz 1";
        String description = "MCQs";
        Date dueDate = new Date();
        Teacher teacher = new Teacher("John", "john@uwindsor.ca", "PRO002", "IT");
        Course course = new Course("Software Engineering","SE001","Module for 3rd year", teacher);
        int marks = 10;

        Quiz quiz = new Quiz(title, description, dueDate, course);
        quiz.setMarks(marks);
        assertNotNull(quiz);

        assertEquals(title, quiz.getTitle());
        assertEquals(description, quiz.getDescription());
        assertEquals(dueDate, quiz.getDueDate());
        assertEquals(course, quiz.getCourse());
        assertEquals(10, quiz.getMarks());

        quiz.setMarks(marks);
        assertEquals(marks, quiz.getMarks());
    }
}
