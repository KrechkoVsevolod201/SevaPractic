package ru.ssau.tk.Practice3_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_1Test {

    @Test
    public void testSetString() {
        String arrayStr = new String("So... I love you");
        new Task3_1().setString(arrayStr);
    }
}