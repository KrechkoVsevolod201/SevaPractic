package ru.ssau.tk.Practice3_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_20Test {

    @Test
    public void testString() {
        String[] str = {"So", "i", "love", "you"};
        assertEquals(Task3_20.string(str), "So, i, love, you");
    }
}