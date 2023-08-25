//B21DCCN441

import java.util.*;

class point {

    private double x, y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(point p) {
        double c1 = this.x - p.x;
        double c2 = this.y - p.y;
        return Math.sqrt(c1 * c1 + c2 * c2);
    }
}

class TamGiac {

    private double a, b, c;

    public TamGiac(double x, double y, double z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public boolean check() {
        if (a + b > c && a + c > b && b + c > a && Math.abs(a - c) < b && Math.abs(b - c) < a && Math.abs(a - b) < c) {
            return true;
        }
        return false;
    }

    public void dientichhinhtronngoaitiep() {
        double s = 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (-a + b + c) * (a - b + c));
        double r = a * b * c / (4.0 * s);
        System.out.printf("%.3f\n", Math.PI * r * r);
    }

}

public class J04010_DienTichHinhTronNgoaiTiepTamGiac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            point p1 = new point(sc.nextDouble(), sc.nextDouble());
            point p2 = new point(sc.nextDouble(), sc.nextDouble());
            point p3 = new point(sc.nextDouble(), sc.nextDouble());
            TamGiac p = new TamGiac(p1.distance(p2), p1.distance(p3), p3.distance(p2));
            if (p.check()) {
                p.dientichhinhtronngoaitiep();
            } else {
                System.out.println("INVALID");
            }

        }
    }
}
