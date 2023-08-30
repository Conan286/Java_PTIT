//B21DCCN441
import java.util.*;
import java.math.*;
import java.io.*;

class NhanVien {

    private String name, cv, id;
    private int lt, t, pc, tt, snc, ln;

    public NhanVien(int i, String name, int ln, int snc, String cv) {
        if (i < 10) {
            this.id = "NV0" + i;
        } else {
            this.id = "NV" + i;
        }
        this.name = name;
        this.ln = ln;
        this.snc = snc;
        this.cv = cv;
        this.lt = snc * ln;
        this.t = 0;
        if (snc >= 25) {
            this.t = lt * 20 / 100;
        } else if (snc >= 22) {
            this.t = lt * 10 / 100;
        }
        this.pc = 150000;
        if (cv.equals("GD")) {
            this.pc = 250000;
        } else if (cv.endsWith("PGD")) {
            this.pc = 200000;
        } else if (cv.endsWith("TP")) {
            this.pc = 180000;
        }
        this.tt = this.lt + this.t + this.pc;
    }

    public int getThuNhap() {
        return this.tt;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.lt + " " + this.t + " " + this.pc + " " + this.tt;
    }
}

public class J05041_SapXepBangTinhCong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            int luong = sc.nextInt();
            int soNgayCong = sc.nextInt();
            sc.nextLine();
            String chucvu = sc.nextLine();
            a.add(new NhanVien(i, name, luong, soNgayCong, chucvu));
        }
        Collections.sort(a, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
                return t.getThuNhap() < t1.getThuNhap() ? 1 : -1;
            }
        });
        for (NhanVien nv : a) {
            System.out.println(nv);
        }
    }
}
