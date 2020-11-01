package ru.ssau.tk.Practice1_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    NamedPoint second = new NamedPoint(1, 3, 5);
    NamedPoint first = new NamedPoint(7, 9, 11, "Seva");


    @Test
    public void testSetName() {
        first.setName("Dog");
        second.setName("Frog");
        assertEquals(second.getName(), "Frog");
        assertNotEquals(first.getName(), "Cat");
    }

    @Test
    public void testGetName() {
        assertNull(second.getName());
        assertEquals(first.getName(), "Seva");
    }
}