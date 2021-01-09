package ru.ssau.tk.Practice4_4;

public class Task4_4 {
    public static int string(String str_1, String str_2) {
        if (Integer.parseInt(str_2) == 0) {
            throw new ArithmeticException();
        }
        if (!Character.isDigit(str_1.charAt(0)) || !Character.isDigit(str_2.charAt(0))) {
            throw new NumberFormatException();
        }
        return Integer.parseInt(str_1) / Integer.parseInt(str_2);
    }
}
