package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGrade() {
        assertEquals("A", App.calculateGrade(95));
        assertEquals("B", App.calculateGrade(80));
        assertEquals("C", App.calculateGrade(65));
        assertEquals("D", App.calculateGrade(45));
        assertEquals("F", App.calculateGrade(30));
    }
}
