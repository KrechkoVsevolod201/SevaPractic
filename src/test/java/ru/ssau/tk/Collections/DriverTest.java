package ru.ssau.tk.Collections;

import org.testng.annotations.Test;
import ru.ssau.tk.Practice1_17.Gender;
import ru.ssau.tk.Practice1_2.Code.Person;

import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.*;
import static ru.ssau.tk.Practice1_17.Gender.*;

public class DriverTest {
    Driver firstDriver = new Driver();
    Driver secondDriver = new Driver();
    Driver thirdDriver = new Driver();

    @Test
    public void testTestEquals() {
        firstDriver.setId(1);
        firstDriver.setName("Vladimir");
        firstDriver.setGender(MALE);
        firstDriver.setLicenseExpirationDate(new Date(124, Calendar.MARCH, 17));

        secondDriver.setId(2);
        secondDriver.setName("Yuri");
        secondDriver.setGender(MALE);
        secondDriver.setLicenseExpirationDate(new Date(130, Calendar.MARCH, 24));

        thirdDriver.setId(2);
        thirdDriver.setName("Vladimir");
        thirdDriver.setGender(MALE);
        thirdDriver.setLicenseExpirationDate(new Date(136, Calendar.MARCH, 9));

        assertFalse(firstDriver.equals(thirdDriver));

        thirdDriver.setId(1);

        assertTrue(firstDriver.equals(thirdDriver));
        assertTrue(thirdDriver.equals(firstDriver));
        assertTrue(secondDriver.equals(secondDriver));
        assertFalse(firstDriver.equals(secondDriver));
        assertFalse(thirdDriver.equals(new Person()));
        assertFalse(secondDriver.equals(null));
    }

    @Test
    public void testTestToString() {
        firstDriver.setId(1);
        firstDriver.setName("Vladimir");
        firstDriver.setGender(MALE);
        firstDriver.setLicenseExpirationDate(new Date(124, Calendar.MARCH, 17));

        secondDriver.setId(2);
        secondDriver.setName("Yuri");
        secondDriver.setGender(MALE);
        secondDriver.setLicenseExpirationDate(new Date(130, Calendar.MARCH, 24));

        assertEquals(firstDriver.toString(), "Driver: ID: 1; Name: Vladimir; Gender: MALE; LicenseExpirationDate: Sun Mar 17 00:00:00 SAMT 2024.");
        assertEquals(secondDriver.toString(), "Driver: ID: 2; Name: Yuri; Gender: MALE; LicenseExpirationDate: Sun Mar 24 00:00:00 SAMT 2030.");
    }
}