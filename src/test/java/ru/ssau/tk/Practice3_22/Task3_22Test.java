package ru.ssau.tk.Practice3_22;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_22Test {

    @Test
    public void testStringOfNumber() {
        assertEquals(Task3_22.stringOfNumber(7),"0123456");
        System.out.println(Task3_22.stringOfNumber(10000));
    }
}