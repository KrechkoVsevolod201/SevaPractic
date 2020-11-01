package ru.ssau.tk.Practice1_2.Code;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testFirstName() {
        Person somePerson = new Person();
        somePerson.setFirstName("Seva");
        assertEquals(somePerson.getfirstName(), "Seva");
        assertNotEquals(somePerson.getfirstName(), "Nastya");

        somePerson.setFirstName("Oleg");
        assertEquals(somePerson.getfirstName(), "Oleg");
        assertNotEquals(somePerson.getfirstName(), "Seva");
    }

    @Test
    public void testLastName() {
        Person somePerson = new Person();
        somePerson.setlastName("Krechko");
        assertEquals(somePerson.getlastName(), "Krechko");
        assertNotEquals(somePerson.getfirstName(), "Kasyanenko");

        somePerson.setlastName("Pelmennikov");
        assertEquals(somePerson.getlastName(), "Pelmennikov");
        assertNotEquals(somePerson.getlastName(), "Krechko");
    }

    @Test
    public void testPassportId() {
        Person somePerson = new Person();
        somePerson.setpassportId(5858);
        assertEquals(somePerson.getpassportId(), 5858);

        somePerson.setpassportId(6858);
        assertNotEquals(somePerson.getpassportId(), 1234);
        assertEquals(somePerson.getpassportId(), 6858);
    }


}