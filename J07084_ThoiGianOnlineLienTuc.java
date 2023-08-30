//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class SinhVien {

    private String name, dayIn, dayOut, timeIn, timeOut;
    private int time, space;

    public SinhVien(String name, String in, String out) {
        this.name = name;
        this.dayIn = in.split(" ")[0];
        this.dayOut = out.split(" ")[0];
        this.timeIn = in.split(" ")[1];
        this.timeOut = out.split(" ")[1];
        this.space = dis(dayIn, dayOut);
        this.time = 0;
        if (space == 0) {
            this.time = timeOfDay(timeOut) - timeOfDay(timeIn);
        } else {
            this.time = 24 * 60 - timeOfDay(timeIn) + timeOfDay(timeOut) + 24 * 60 * (space - 1);
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.time;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
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
        return dayth(d2, m2, y2) - dayth(d1, m1, y1);
    }

    public int timeOfDay(String s) {
        return Integer.valueOf(s.substring(0, 2)) * 60 + Integer.valueOf(s.substring(3, 5)); //hh:mm:ss
    }
}

public class J07084_ThoiGianOnlineLienTuc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                if (t.getTime() != t1.getTime()) {
                    return t.getTime() > t1.getTime() ? -1 : 1;
                }
                return t.getName().compareTo(t1.getName());
            }
        });
        for (SinhVien sv : a) {
            System.out.println(sv);
        }
    }
}
