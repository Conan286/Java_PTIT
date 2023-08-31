//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class thiSinh {

    private String id, name, trangThai;
    private double toan, ly, hoa, diemUuTien, tongDiem;

    public thiSinh(String id, String name, double t, double l, double h) {
        this.id = id;
        this.name = name;
        this.toan = t;
        this.ly = l;
        this.hoa = h;
        this.tongDiem = t + t + l + h;
        this.diemUuTien = 0.5;
        if (id.substring(0, 3).equals("KV2")) {
            this.diemUuTien = 1;
        } else if (id.substring(0, 3).equals("KV3")) {
            this.diemUuTien = 2.5;
        }
        this.trangThai = "TRUNG TUYEN";
        if (this.tongDiem + this.diemUuTien < 24) {
            this.trangThai = "TRUOT";
        }
    }

    public void display() {
        if (id.subSequence(0, 3).equals("KV2")) {
            System.out.printf("%s %s %.0f ", id, name, diemUuTien);
        } else {
            System.out.printf("%s %s %.1f ", id, name, diemUuTien);
        }
        int k = (int) tongDiem;
        if (tongDiem - k > 0) {
            System.out.printf("%.1f %s\n", tongDiem, trangThai);
        } else {
            System.out.printf("%.0f %s\n", tongDiem, trangThai);
        }
    }
}

public class J05057_BangDiemTuyenSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<thiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        for (thiSinh tS : a) {
            tS.display();
        }
    }
}
