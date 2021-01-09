package ru.ssau.tk.Practice3_21;

public class Task3_21 {
    public static void main(String[] args) {
        String str = "So i love you";
        StringBuilder strBldr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBldr.replace(i, i + 1, i + "");
            }
        }

        strBldr.reverse();
        System.out.println(strBldr.toString());
    }
}
