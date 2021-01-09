package ru.ssau.tk.Practice3_22;

public class Task3_22 {
    static String stringOfNumber(int cout) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < cout; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
