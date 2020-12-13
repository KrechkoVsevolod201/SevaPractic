package ru.ssau.tk.Practice3_5;

import java.util.Objects;

public class Task3_5 {
    static boolean string(String str_1,String str_2){
        return !Objects.equals(null, str_1) && !Objects.equals(null, str_2)
                && !str_1.equals(str_2)
                && str_1.equalsIgnoreCase(str_2);
    }
}
