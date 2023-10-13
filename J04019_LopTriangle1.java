
import java.io.*;
import java.math.*;
import java.util.*;

class Point {

    public float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        Point ans = new Point(x, y);
        return ans;
    }
}

class Triangle {

    public float c1, c2, c3, cv;

    public Triangle(Point p1, Point p2, Point p3) {
        this.c1 = (float) Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        this.c2 = (float) Math.sqrt((p1.x - p3.x) * (p1.x - p3.x) + (p1.y - p3.y) * (p1.y - p3.y));
        this.c3 = (float) Math.sqrt((p3.x - p2.x) * (p3.x - p2.x) + (p3.y - p2.y) * (p3.y - p2.y));
        this.cv = this.c1 + this.c2 + this.c3;
    }

    public boolean valid() {
        if (c1 + c2 > c3 && c2 + c3 > c1 && c1 + c3 > c2) {
            return true;
        }
        return false;
    }

    public String getPerimeter() {
        return String.format("%.3f", this.cv);
    }
}

public class J04019_LopTriangle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}
