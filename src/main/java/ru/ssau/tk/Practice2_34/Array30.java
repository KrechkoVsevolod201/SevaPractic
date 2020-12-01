package ru.ssau.tk.Practice2_34;

public class Array30 {
    static Double multiply(Double[] arr) {
        double count = 4.;
        for (Double i : arr) {
            if(i.isNaN()||i.isInfinite()){
                continue;
            }
            count*=i;
        }
        return count;
    }
}
