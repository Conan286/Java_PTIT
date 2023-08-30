//B21DCCN441 - Giai tri cung jav

import java.util.*;
import java.io.*;
import java.math.*;

class doanhNghiep {

    public String tdn, mdn;
    public int ssv;

    public doanhNghiep(String a, String b, int c) {
        this.mdn = a;
        this.tdn = b;
        this.ssv = c;
    }

    public void display() {
        System.out.println(mdn + " " + tdn + " " + ssv);
    }
}

public class J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<doanhNghiep> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new doanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<doanhNghiep>() {
            @Override
            public int compare(doanhNghiep t, doanhNghiep t1) {
                if (t.ssv != t1.ssv) {
                    return t.ssv > t1.ssv ? -1 : 1;
                }
                return t.mdn.compareTo(t1.mdn);
            }
        });
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + x1 + " DEN " + y1 + " SINH VIEN:");
            for (doanhNghiep p : a) {
                if (p.ssv >= x1 && p.ssv <= y1) {
                    p.display();
                }
            }
        }
    }
}
