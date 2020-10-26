package ru.ssau.tk.Practice1_4;
import ru.ssau.tk.Practice1_3.Point;
public class Points {

    private Points() {

    }

    public static Point sum(Point per1, Point per2) {
        return new Point(per1.x + per2.x, per1.y + per2.y, per1.z + per2.z);
    }

    public static Point subtract(Point per1, Point per2) {
        return new Point(per1.x - per2.x, per1.y - per2.y, per1.z - per2.z);
    }

    public static Point multiply(Point per1, Point per2) {
        return new Point(per1.x * per2.x, per1.y * per2.y, per1.z * per2.z);
    }

    public static Point divide(Point per1, Point per2) {
        return new Point(per1.x / per2.x, per1.y / per2.y, per1.z / per2.z);
    }
}