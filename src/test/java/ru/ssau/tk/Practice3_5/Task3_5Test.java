package ru.ssau.tk.Practice3_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_5Test {

    @Test
    public void testString() {
        String str_1 = "so i love you";
        String str_2 = "SO I LOVE YOU";
        assertTrue(Task3_5.string(str_1, str_2));
        assertFalse(Task3_5.string(str_1, str_1));
        assertFalse(Task3_5.string(null, str_2));
        assertFalse(Task3_5.string(str_1, null));
        assertFalse(Task3_5.string(null, null));
    }
}