package ru.ssau.tk.Practice3_3;

public class Task3_3 {
    public static void main(String[] args) {
        String str = "So i love you";
        String str_1 = new String(str);
        String str_2 = "So i love you";
        if(str==str_2){
            System.out.println("str==str2");
        }
        if (str == str_1) {
            System.out.println("str==str1");
        }
        if (str.equals(str_1)) {
            System.out.println("str.equals(str1)");
        }
    }
}
