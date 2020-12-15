package ru.ssau.tk.Practice3_10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_10Test {

    @Test
    public void testSetArray() {
        String[]array = new String[]{"I","love","you"};
        assertEquals( Task3_10.setArray(array,"y","u"),1);
        assertEquals(Task3_10.setArray(array,"a","y"),0);
    }
}