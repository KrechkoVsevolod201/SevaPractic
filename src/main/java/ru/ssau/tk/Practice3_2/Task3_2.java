package ru.ssau.tk.Practice3_2;

public class Task3_2 {
    public void getString(String str){
        byte[] bytes = str.getBytes();
        for (byte byt:bytes) {
            System.out.println(byt);
        }
    }
}
