
import java.util.*;
import java.io.*;
import java.math.*;

class KH {

    public String mkh;
    public int hs, sc, sm, sd, tt, pt, ttpt;

    public KH(int id, String sub, int csc, int csm) {
        if (id < 10) {
            this.mkh = "KH0" + String.valueOf(id);
        } else {
            this.mkh = "KH" + String.valueOf(id);
        }
        if (sub.equals("KD")) {
            this.hs = 3;
        } else if (sub.equals("NN")) {
            this.hs = 5;
        } else if (sub.equals("TT")) {
            this.hs = 4;
        } else {
            this.hs = 2;
        }
        this.sc = csc;
        this.sm = csm;
        this.sd = this.sm - this.sc;
        this.tt = this.sd * this.hs * 550;
        if (this.sd < 50) {
            this.pt = 0;
        } else if (this.sd <= 100) {
            double r = this.tt * 0.35;
            int k = (int) r;
            if (r - (double) k > 0) {
                k += 1;
            }
            this.pt = k;
        } else {
            this.pt = this.tt;
        }
        this.ttpt = this.tt + this.pt;
    }

    public void print() {
        System.out.printf("%s %d %d %d %d\n", mkh, hs, tt, pt, ttpt);
    }
}

public class J05051_SapXepBangTinhTienDien {

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
                return t.ttpt > t1.ttpt ? -1 : 1;
            }
        });
        for (KH kh : a) {
            kh.print();
        }
    }
}
