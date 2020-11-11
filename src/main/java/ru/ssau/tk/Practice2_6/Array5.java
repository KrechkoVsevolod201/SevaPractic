package ru.ssau.tk.Practice2_6;

public class Array5 {
    public static int[] array(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(i, 2);
        }
        return array;
    }
}
