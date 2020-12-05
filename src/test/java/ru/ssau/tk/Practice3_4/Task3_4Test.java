package ru.ssau.tk.Practice3_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_4Test {

    @Test
    public void testGetStroka() {
        assertEquals(Task3_4.getStroka("So"),false);
        assertEquals(Task3_4.getStroka("i"),true);
        assertEquals(Task3_4.getStroka("love"),false);
        assertEquals(Task3_4.getStroka("you"),false);
    }
}