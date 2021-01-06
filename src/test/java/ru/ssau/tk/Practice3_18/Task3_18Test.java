package ru.ssau.tk.Practice3_18;

import org.testng.annotations.Test;
import ru.ssau.tk.Practice1_2.Code.Person;
import ru.ssau.tk.Practice1_3.NamedPoint;
import ru.ssau.tk.Practice1_3.Point;

import static org.testng.Assert.*;

public class Task3_18Test {

    @Test
    public void testDescription() {
        Task3_18.description(new Person("Ivan", "Pelmenikov", 567474));
        Task3_18.description(new Point(0, 1, 2));
        Task3_18.description(new NamedPoint(0, 1, 4, "X"));
    }
}