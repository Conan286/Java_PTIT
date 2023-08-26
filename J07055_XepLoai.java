import java.util.*;
import java.io.*;
import java.math.*;

class sv implements Comparable<sv> {

    public String name, id, xl;
    public double m1, m2, m3, dtb;

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
        this.dtb = (m1 * 25 + m2 * 35 + m3 * 40) / 100;
        if (dtb >= 8) {
            xl = "GIOI";
        } else if (dtb >= 6.5) {
            xl = "KHA";
        } else if (dtb >= 5) {
            xl = "TRUNG BINH";
        } else {
            xl = "KEM";
        }
    }

    @Override
    public int compareTo(sv t) {
        if (this.dtb != t.dtb) {
            return this.dtb > t.dtb ? -1 : 1;
        }
        return this.id.compareTo(t.id);
    }

    public void print() {
        System.out.printf("%s %s %.2f %s\n", id, name, dtb, xl);
    }
}

public class J07055_XepLoai {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList<sv> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new sv(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        for (sv p : a) {
            p.print();
        }
    }
}
