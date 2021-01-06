package ru.ssau.tk.Practice3_13;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_13Test {

    @Test
    public void testString() {
        String str = "So i love you";
        int maxSizeStr = str.length();
        assertEquals(Task3_13.string(str, -3, maxSizeStr), str);
        assertEquals(Task3_13.string(str, 2, maxSizeStr), str.substring(2));
        assertEquals(Task3_13.string(str, 0, 14), str.substring(0, 13));
        assertEquals(Task3_13.string(str, 2, 14), str.substring(2, 13));
    }
}