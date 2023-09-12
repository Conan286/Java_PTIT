//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

class KH {

    public String name, id;
    public int soDien, tien;

    public KH(int i, String name, int csc, int csm) {
        this.id = "KH" + i;
        if (i < 10) {
            this.id = "KH0" + i;
        }
        this.name = name;
        this.soDien = csm - csc;
        this.tien = Hoadon(this.soDien);
    }

    public int Hoadon(int k) {
        if (k <= 50) {
            return k * 102;
        } else if (k <= 100) {
            double x = (50 * 100 + (k - 50) * 150) * 1.03;
            int real = (int) (x);
            if (x - real < 0.5) {
                return (int) (x);
            } else {
                return real + 1;
            }
        }
        double x = (50 * 100 + 50 * 150 + (k - 100) * 200) * 1.05;
        int real = (int) (x);
        if (x - real < 0.5) {
            return (int) (x);
        } else {
            return real + 1;
        }
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.tien;
    }
}

public class J05017_HoaDonTienNuoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KH> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new KH(i, sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<KH>() {
            @Override
            public int compare(KH t, KH t1) {
                return t1.tien - t.tien;
            }
        });
        for (KH kh : a) {
            System.out.println(kh);
        }
    }
}
