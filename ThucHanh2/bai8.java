//B21DCCN441

import java.io.*;
import java.math.*;
import java.util.*;

class SinhVien {

    public String name, lop, birth;
    public double score;

    public SinhVien(String name, String b, double p1, double p2, double p3) {
        this.name = name;
        this.birth = title(b);
        this.score = p1 + p2 + p3;
    }

    public String title(String bi) {
        String b = bi;
        if (b.charAt(1) == '/') {
            b = "0" + b;
        }
        if (b.charAt(4) == '/') {
            b = b.substring(0, 3) + "0" + b.substring(3);
        }
        return b;
    }

    @Override
    public String toString() {
        return this.name + " " + this.birth + " " + String.format("%.1f", this.score);

    }
}

public class bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(a);
    }
}
