package ru.ssau.tk.Practice1_4;
import ru.ssau.tk.Practice1_3.Point;
public class Points {
    private static Point per1;
    private static Point per2;

    private Points(){

    }
    public static Point sum(Point per1, Point per2){
        return new Point(per1.x + per2.x, per1.y + per2.y, per1.z + per2.z);
    }
    public static Point subtract(Point per1, Point per2){
        return new Point(per1.x - per2.x, per1.y - per2.y, per1.z - per2.z);
    }
    public static Point multiply(Point per1, Point per2){
        return new Point(per1.x * per2.x, per1.y * per2.y, per1.z * per2.z);
    }
    public static Point divide(Point per1, Point per2){
        return new Point(per1.x / per2.x, per1.y / per2.y, per1.z / per2.z);
    }
    public static Point enlarge(Point peremennaya,double c){
        return new Point(peremennaya.x*c,peremennaya.y*c,peremennaya.z*c);
    }
    static Point opposite(Point peremennaya){
        return new Point(peremennaya.x*-1,peremennaya.y*-1,peremennaya.z*-1);
    }
    static Point inverse(Point peremennaya){
        return new Point(1/peremennaya.x, 1/peremennaya.y, 1/peremennaya.z);
    }
    public static double scalarProduct(Point per1, Point per2) {
        return per1.x * per2.x + per1.y * per2.y + per1.z * per2.z;
    }

    public static Point vectorProduct(Point per1, Point per2) {
        return new Point(per1.y * per2.z - per1.z * per2.y, per1.z * per2.x - per1.x * per2.z, per1.x * per2.y - per1.y * per2.x);
    }
}