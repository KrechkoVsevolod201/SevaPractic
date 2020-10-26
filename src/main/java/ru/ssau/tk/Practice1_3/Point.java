package ru.ssau.tk.Practice1_3;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);
        Point point3 = new Point(7, 8, 9);
    }
}