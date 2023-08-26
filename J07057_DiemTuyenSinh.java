import java.util.*;
import java.io.*;
import java.math.*;

class Thisinh implements Comparable<Thisinh> {

    public String ht, mts, tt;
    public double t;

    public Thisinh(int id, String ht, double p, String dt, int kv) {
        if (id < 10) {
            this.mts = "TS0" + String.valueOf(id);
        } else {
            this.mts = "TS" + String.valueOf(id);
        }
        StringTokenizer ss = new StringTokenizer(ht.toLowerCase());
        String ans = "";
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            char x = (char) (s.charAt(0) - 32);
            ans += x + s.substring(1) + " ";
        }
        this.ht = ans.substring(0, ans.length() - 1);
        this.t = p;
        dt = dt.toLowerCase();
        if (dt.equals("kinh") == false) {
            this.t += 1.5;
        }
        if (kv == 1) {
            t += 1.5;
        } else if (kv == 2) {
            t += 1.0;
        }
        if (this.t >= 20.5) {
            this.tt = "Do";
        } else {
            this.tt = "Truot";
        }
    }

    public void print() {
        System.out.printf("%s %s %.1f %s\n", mts, ht, t, tt);
    }

    @Override
    public int compareTo(Thisinh t1) {
        if (this.t != t1.t) {
            return this.t > t1.t ? -1 : 1;
        }
        return this.mts.compareTo(t1.mts);
    }
}

public class J07057_DiemTuyenSinh {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        ArrayList<Thisinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double point = sc.nextDouble();
            sc.nextLine();
            String dantoc = sc.nextLine();
            int khuvuc = sc.nextInt();
            a.add(new Thisinh(i, name, point, dantoc, khuvuc));
        }
        Collections.sort(a);
        for (Thisinh ts : a) {
            ts.print();
        }
    }
}
