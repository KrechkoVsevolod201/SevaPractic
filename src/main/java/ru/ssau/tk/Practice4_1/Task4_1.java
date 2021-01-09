package ru.ssau.tk.Practice4_1;

import ru.ssau.tk.Practice1_2.Code.Person;

public class Task4_1 {
    public static String objectPerson(Person obj) {
        if (obj.getfirstName() == null || obj.getlastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
