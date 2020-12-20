package ru.ssau.tk.Practice3_12;

public class Task3_12 {
    static String string(String str_1, String str_2, String str_3) {
        for (int i = 0; i < 100 && str_1.contains(str_2); i++) {
            str_1 = str_1.replaceAll(str_2, str_3);
        }
        return str_1;
    }
}
