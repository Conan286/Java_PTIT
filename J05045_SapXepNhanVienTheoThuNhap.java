//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class nhanVien {

    private String name, cv, id;
    private int pc, lc, tu, cl, lcb, snc;

    public nhanVien(int i, String name, String cv, int lcb, int snc) {
        if (i < 10) {
            this.id = "NV0" + i;
        } else {
            this.id = "NV" + i;
        }
        this.name = name;
        this.cv = cv;
        this.snc = snc;
        this.lcb = lcb;
        this.lc = this.lcb * this.snc;
        this.pc = 100;
        if (cv.equals("GD")) {
            this.pc = 500;
        } else if (cv.equals("PGD")) {
            this.pc = 400;
        } else if (cv.equals("TP")) {
            this.pc = 300;
        } else if (cv.equals("KT")) {
            this.pc = 250;
        }
        double t = (this.pc + this.lc) * 2.0 / 3.0;
        this.tu = 25000;
        if (t < 25000) {
            this.tu = round(t);
        }
        this.cl = this.pc + this.lc - this.tu;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.pc + " " + this.lc + " " + this.tu + " " + this.cl;
    }

    public int round(double t) {
        double z = t / 1000;
        double k = Math.round(z);
        int h = (int) k;
        return h * 1000;
    }

    public String getId() {
        return this.id;
    }

    public int ThuNhap() {
        return this.lc + this.pc;
    }
}

public class J05045_SapXepNhanVienTheoThuNhap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<nhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new nhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien t, nhanVien t1) {
                if (t.ThuNhap() != t1.ThuNhap()) {
                    return t.ThuNhap() > t1.ThuNhap() ? -1 : 1;
                }
                return t.getId().compareTo(t1.getId());
            }
        });
        for (nhanVien nv : a) {
            System.out.println(nv);
        }
    }
}
