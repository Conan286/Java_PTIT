import java.io.*;
import java.util.*;
import java.math.*;

class ThiSinh {

    private String name, birth;
    private double p1, p2, p3;

    public ThiSinh(String n, String b, double p1, double p2, double p3) {
        this.name = n;
        this.birth = b;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void print() {
        System.out.printf("%s %s %.1f\n", name, birth, (p1 + p2 + p3));
    }
}

public class J04005_KhaiBaoLopThiSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh y = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        y.print();
    }
}
