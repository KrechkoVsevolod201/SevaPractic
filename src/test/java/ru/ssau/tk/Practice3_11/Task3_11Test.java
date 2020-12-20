package ru.ssau.tk.Practice3_11;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_11Test {

    @Test
    public void testString() {
        String[] array = new String[]{"So", "i", "love", "you"};
        assertEquals(Task3_11.string(array, "S", "i"), 0);
        assertEquals(Task3_11.string(array,"l","u"),0);
    }
}