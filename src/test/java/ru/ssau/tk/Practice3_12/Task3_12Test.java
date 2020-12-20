package ru.ssau.tk.Practice3_12;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_12Test {

    @Test
    public void testString() {
        assertEquals(new Task3_12().string("opopopopo", "opo", "po"), "popppo");
    }
}