package ru.ssau.tk.Practice2_33;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array29Test {

    @Test
    public void testSting() {
        String[] array = new String[]{"I","love","you"};
        Array29.string(array);
    }
}