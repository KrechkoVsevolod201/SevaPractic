package ru.ssau.tk.Practice3_9;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_9Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Task3_9.getIndexOf("lover", "lo"),0);
        assertEquals(Task3_9.getIndexOf("doggy", "gy"),-1);
    }
}