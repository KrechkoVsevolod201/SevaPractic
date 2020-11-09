package ru.ssau.tk.Practice2_4;

public class Array3 {
    public static int[] massif(int size) {
        int fullSize = 2 * size;
        int[] massif = new int[fullSize];
        for (int i = 0; i < massif.length; i++) {
            massif[i] = fullSize;
            fullSize -= 2;
        }
        return massif;
    }
}
