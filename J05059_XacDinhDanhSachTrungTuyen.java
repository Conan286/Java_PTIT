import java.util.*;
import java.io.*;
import java.math.*;

class ThiSinh implements Comparable<ThiSinh> {

    public String mts, ht, kv, tt;
    public double t, l, h, s, dut;

    public ThiSinh(String mts, String ht, double t, double l, double h) {
        this.mts = mts;
        this.kv = mts.substring(0, 3);
        if (kv.equals("KV1")) {
            this.dut = 0.5;
        } else if (kv.equals("KV2")) {
            this.dut = 1;
        } else {
            this.dut = 2.5;
        }
        this.t = t;
        this.l = l;
        this.h = h;
        this.s = this.l + this.h + this.t * 2 + this.dut;
        this.tt = "TRUOT";
        StringTokenizer ss = new StringTokenizer(ht.toLowerCase());
        String ans = "";
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            char x = (char) (s.charAt(0) - 32);
            ans += x + s.substring(1) + " ";
        }
        this.ht = ans.substring(0, ans.length() - 1);
    }

    public void setTT(String tt) {
        this.tt = tt;
    }

    public void display() {
        if (kv.equals("KV1") || kv.equals("KV3")) {
            System.out.printf("%s %s %.1f ", mts, ht, dut);
        } else {
            System.out.printf("%s %s %.0f ", mts, ht, dut);
        }
        int v = (int) s;
        if (s - (double) v == 0) {
            System.out.printf("%.0f %s\n", s, tt);
        } else {
            System.out.printf("%.1f %s\n", s, tt);
        }

    }

    @Override
    public int compareTo(ThiSinh t1) {
        if (this.s != t1.s) {
            return this.s > t1.s ? -1 : 1;
        } else {
            return this.mts.compareTo(t1.mts);
        }
    }
}

public class J05059_XacDinhDanhSachTrungTuyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        int ct = sc.nextInt();
        double dc = a.get(ct - 1).s;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).s >= dc) {
                a.get(i).setTT("TRUNG TUYEN");
            } else {
                break;
            }
        }
        System.out.println(dc);
        for (ThiSinh ts : a) {
            ts.display();
        }
    }
}