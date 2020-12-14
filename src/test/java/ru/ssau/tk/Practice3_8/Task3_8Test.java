package ru.ssau.tk.Practice3_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_8Test {

    @Test
    public void testIndexof() {
        assertEquals(Task3_8.indexof("lover", "lo"), -1);
        assertEquals(Task3_8.indexof("doggy", "gy"),3);
    }
}