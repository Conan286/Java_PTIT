//B21DCCN441
import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

class Sinhvien {

    public String id, name, phone;
    public int idGroup;

    public Sinhvien(String msv, String ten, String sdt, int group) {
        this.id = msv;
        this.name = ten;
        this.phone = sdt;
        this.idGroup = group;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.phone;
    }
}

public class J06003_QuanLyBaiTapNhom1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, String> project = new TreeMap<>();
        ArrayList<Sinhvien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            String s = sc.nextLine();
            project.put(i, s);
        }
        int Q = sc.nextInt();
        while (Q-- > 0) {
            int g = sc.nextInt();
            System.out.println("DANH SACH NHOM " + g + ":");
            for (Sinhvien sv : a) {
                if (sv.idGroup == g) {
                    System.out.println(sv);
                }
            }
            System.out.println("Bai tap dang ky: " + project.get(g));
        }
    }
}
