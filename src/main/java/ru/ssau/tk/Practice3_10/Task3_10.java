package ru.ssau.tk.Practice3_10;

public class Task3_10 {
    static int setArray(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}