package ru.ssau.tk.Practice3_4;

public class Task3_4 {
    static boolean getStroka(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
