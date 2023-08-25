import java.io.*;
import java.util.*;
import java.math.*;

class SinhVien {

    private String msv, hoten, lop, ngaysinh;
    private double gpa;

    public SinhVien(String x, String y, String z, double w) {
        this.msv = "B20DCCN001";
        this.hoten = x;
        this.lop = y;
        this.gpa = w;
        if (z.charAt(1) == '/') {
            z = "0" + z;
        }
        if (z.charAt(4) == '/') {
            z = z.substring(0, 3) + "0" + z.substring(3);
        }
        this.ngaysinh = z;
    }

    public void print() {
        System.out.printf("%s %s %s %s %.2f\n", msv, hoten, lop, ngaysinh, gpa);
    }
}

public class J04006_KhaiBaoLopSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien y = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        y.print();
    }
}
