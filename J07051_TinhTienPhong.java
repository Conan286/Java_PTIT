//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class Khach {

    public String mkh, tkh, mp, in, out;
    public int snlt, dg, pp, tt;

    public Khach(int id, String name, String room, String dayin, String dayout, int pp) {
        if (id < 10) {
            mkh = "KH0" + String.valueOf(id);
        } else {
            mkh = "KH" + String.valueOf(id);
        }
        this.tkh = Title(name);
        this.mp = room;
        this.in = TitleDate(dayin);
        this.out = TitleDate(dayout);
        this.snlt = dis(this.in, this.out);
        this.pp = pp;
        this.dg = 25;
        if (room.subSequence(0, 1).equals("2")) {
            this.dg = 34;
        } else if (room.subSequence(0, 1).equals("3")) {
            this.dg = 50;
        } else if (room.subSequence(0, 1).equals("4")) {
            this.dg = 80;
        }
        this.tt = this.dg * this.snlt + this.pp;
    }

    public String Title(String name) {
        String ans = "";
        StringTokenizer ss = new StringTokenizer(name.toLowerCase());
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            ans += s.toUpperCase().charAt(0) + s.substring(1) + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }

    public String TitleDate(String day) {
        String ans = day;
        if (ans.charAt(1) == '/') {
            ans = "0" + ans;
        }
        if (ans.charAt(4) == '/') {
            ans = ans.substring(0, 3) + "0" + ans.substring(3);
        }
        return ans;
    }

    public int dayOfYear(int y) {
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
            return 366;
        } else {
            return 365;
        }
    }

    public int dayOfMonth(int m, int y) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m != 2) {
            return 30;
        } else if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
            return 29;
        } else {
            return 28;
        }
    }

    public int dayth(int d, int m, int y) {
        if (m == 1) {
            return d;
        }
        int day = 0;
        for (int i = 1; i < m; i++) {
            day += dayOfMonth(i, y);
        }
        return day + d;
    }

    public int dis(String a, String b) {
        int d1 = Integer.valueOf(a.substring(0, 2));
        int d2 = Integer.valueOf(b.substring(0, 2));
        int m1 = Integer.valueOf(a.substring(3, 5));
        int m2 = Integer.valueOf(b.substring(3, 5));
        int y1 = Integer.valueOf(a.substring(6, 10));
        int y2 = Integer.valueOf(b.substring(6, 10));
        int distance = 0;
        if (y1 != y2) {
            for (int i = y1 + 1; i < y2; i++) {
                distance += dayOfYear(i);
            }
            distance += dayth(d2, m2, y2);
            distance += dayOfYear(y1) - dayth(d1, m1, y1);
            return distance;
        }
        return dayth(d2, m2, y2) - dayth(d1, m1, y1) + 1;
    }

    @Override
    public String toString() {
        return this.mkh + " " + this.tkh + " " + this.mp + " " + this.snlt + " " + this.tt;
    }
}

public class J07051_TinhTienPhong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();

        ArrayList<Khach> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new Khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<Khach>() {
            @Override
            public int compare(Khach t, Khach t1) {
                return t.tt > t1.tt ? -1 : 1;
            }
        });
        for (Khach k : a) {
            System.out.println(k);
        }
    }
}
