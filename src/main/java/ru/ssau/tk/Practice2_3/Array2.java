package ru.ssau.tk.Practice2_3;

public class Array2 {
    public static int[] massif(int size) {
        int[] massif = new int[size];
        for (int i = 0; i < massif.length; i++) {
            massif[i] = 2 * i + 1;
        }
        return massif;
    }
}
