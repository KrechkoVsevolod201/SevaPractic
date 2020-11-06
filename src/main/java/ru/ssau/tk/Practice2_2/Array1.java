package ru.ssau.tk.Practice2_2;

public class Array1 {
    public static int[] massif(int size) {
        int[] massif = new int[size];
        massif[0] = 2;
        massif[size - 1] = 2;
        for (int i = 1; i < massif.length - 1; i++) {
            massif[i] = 1;
        }
        return massif;
    }
}
