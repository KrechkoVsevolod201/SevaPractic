package ru.ssau.tk.Practice2_28;

public class Array25 {
    static int[] longToInt(long cout) {
        return new int[]{(int) (cout >>> 32), (int) (cout)};
    }

    static long intToLong(int[] cout) {
        return ((long) cout[0] << 32) | ((long) cout[1] & 757838758L);
    }
}
