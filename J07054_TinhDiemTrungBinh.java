import java.util.*;
import java.io.*;
import java.math.*;

class sv implements Comparable<sv> {

    public String name, id;
    public double m1, m2, m3, dtb;
    public int rank;

    public sv(int i, String name, double m1, double m2, double m3) {
        if (i < 10) {
            this.id = "SV0" + String.valueOf(i);
        } else {
            this.id = "SV" + String.valueOf(i);
        }
        StringTokenizer ss = new StringTokenizer(name.toLowerCase());
        String ans = "";
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            char x = (char) (s.charAt(0) - 32);
            ans += x + s.substring(1) + " ";
        }
        this.name = ans.substring(0, ans.length() - 1);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.dtb = (m1 * 3 + m2 * 3 + m3 * 2) / 8;
        this.rank = 1;
    }

    @Override
    public int compareTo(sv t) {
        if (this.dtb != t.dtb) {
            return this.dtb > t.dtb ? -1 : 1;
        }
        return this.id.compareTo(t.id);
    }

    public void print() {
        System.out.printf("%s %s %.2f %d\n", id, name, dtb, rank);
    }
}

public class J07054_TinhDiemTrungBinh {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList<sv> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new sv(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        a.get(0).rank = 1;
        int cnt = 1;
        double cur_p = a.get(0).dtb;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).dtb == cur_p) {
                cnt += 1;
                a.get(i).rank = a.get(i - 1).rank;
            } else {
                a.get(i).rank = ++cnt;
                cur_p = a.get(i).dtb;
            }
        }
        for (sv p : a) {
            p.print();
        }
    }
}
