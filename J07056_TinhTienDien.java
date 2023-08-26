import java.util.*;
import java.io.*;
import java.math.*;

class KhachHang implements Comparable<KhachHang> {

    public String name, id, sub;
    public int sd, sc, vat, tdm, vdm, tt, dm, sodien;

    public KhachHang(int i, String name, String sub, int sd, int sc) {
        if (i < 10) {
            this.id = "KH0" + String.valueOf(i);
        } else {
            this.id = "KH" + String.valueOf(i);
        }
        StringTokenizer ss = new StringTokenizer(name.toLowerCase());
        String ans = "";
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            char x = (char) (s.charAt(0) - 32);
            ans += x + s.substring(1) + " ";
        }
        this.name = ans.substring(0, ans.length() - 1);
        this.sub = sub;
        this.sd = sd;
        this.sc = sc;
        if (this.sub.equals("A")) {
            this.dm = 100;
        } else if (this.sub.equals("B")) {
            this.dm = 500;
        } else {
            this.dm = 200;
        }
        this.sodien = this.sc - this.sd;
        if (this.sodien <= this.dm) {
            this.tdm = this.sodien * 450;
        } else {
            this.tdm = this.dm * 450;
        }
        if (this.sodien > this.dm) {
            this.vdm = (this.sodien - this.dm) * 1000;
        } else {
            this.vdm = 0;
        }
        this.vat = (int) (this.vdm * 0.05);
        this.tt = this.tdm + this.vdm + this.vat;
    }

    @Override
    public int compareTo(KhachHang t) {
        return this.tt > t.tt ? -1 : 1;
    }

    public void print() {
        System.out.printf("%s %s %d %d %d %d\n", id, name, tdm, vdm, vat, tt);
    }
}

public class J07056_TinhTienDien {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new KhachHang(i, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        for (KhachHang kh : a) {
            kh.print();
        }

    }
}
