//B21DCCN441
import java.util.*;
import java.math.*;
import java.io.*;

class HocSinh {

    public String name, id, tt;
    public double m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, p;

    public HocSinh(int id, String name, double m0, double m1, double m2, double m3, double m4, double m5, double m6, double m7, double m8, double m9) {
        if (id < 10) {
            this.id = "HS0" + id;
        } else {
            this.id = "HS" + id;
        }
        this.name = name;
        this.m0 = m0;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        this.m6 = m6;
        this.m7 = m7;
        this.m8 = m8;
        this.m9 = m9;
        this.p = ((m0 + m0 + m1 + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9) / 12);
        if (p >= 9) {
            tt = "XUAT SAC";
        } else if (p >= 8) {
            tt = "GIOI";
        } else if (p >= 7) {
            tt = "KHA";
        } else if (p >= 5) {
            tt = "TB";
        } else {
            tt = "YEU";
        }
    }

    public void display() {
        System.out.printf("%s %s %.1f %s\n", this.id, this.name, this.p * 10 / 10.0, this.tt);
    }
}

public class J05018_BangDiemHocSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new HocSinh(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh t1, HocSinh t2) {
                if (t1.p != t2.p) {
                    return t1.p > t2.p ? -1 : 1;
                }
                return t1.id.compareTo(t2.id);
            }
        });
        for (HocSinh hs : a) {
            hs.display();
        }
    }
}
