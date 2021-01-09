package ru.ssau.tk.Practice3_24;

import java.nio.charset.Charset;

public class Task3_24 {
    public static void changeCharsetStr(String str, Charset CharSet_1, Charset charSet_2){
        String str2 = new String(str.getBytes(CharSet_1), charSet_2);
        System.out.println(str2);
    }
}
