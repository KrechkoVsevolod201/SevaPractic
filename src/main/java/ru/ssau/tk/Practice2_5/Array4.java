package ru.ssau.tk.Practice2_5;

public class Array4 {
    public static int[] massif(int size) {
        int[] massif = new int[size];
        massif[0] = 0;
        massif[1] = 1;
        for (int i = 2; i < massif.length; i++) {
            massif[i] = massif[i - 1] + massif[i - 2];
        }
        return massif;
    }
}
