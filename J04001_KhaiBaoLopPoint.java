import java.util.*;
import java.io.*;
import java.math.*;

class Point {

    private double x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        double c1 = x - p.x;
        double c2 = y - p.y;
        return Math.sqrt(c1 * c1 + c2 * c2);
    }
}

public class J04001_KhaiBaoLopPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f\n", p1.distance(p2));
        }
    }
}
