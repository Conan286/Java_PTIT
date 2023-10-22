//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class HocSinh {

    private String name, id, tt;
    private double gpa;
    private int rank;

    public HocSinh(int i, String name, double gpa) {
        if (i < 10) {
            this.id = "HS0" + i;
        } else {
            this.id = "HS" + i;
        }
        this.name = name;
        this.gpa = gpa;
        if (gpa >= 9) {
            this.tt = "Gioi";
        } else if (gpa >= 7) {
            this.tt = "Kha";
        } else if (gpa >= 5) {
            this.tt = "Trung Binh";
        } else {
            this.tt = "Yeu";
        }
        this.rank = 1;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void display() {
        System.out.printf("%s %s %.1f %s %d\n", id, name, gpa, tt, rank);
    }
}

public class bai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> a = new ArrayList<>();
        ArrayList<Double> ad = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new HocSinh(i, sc.nextLine(), sc.nextDouble()));
        }
        for (HocSinh hs : a) {
            ad.add(hs.getGpa());
        }
        Collections.sort(ad);
        Collections.reverse(ad);        
        TreeMap<Double, Integer> ts = new TreeMap<>();
        int thuhang = 1;
        ts.put(ad.get(0), 1);
        for (int i = 1; i < ad.size(); i++) {
            if (Objects.equals(ad.get(i), ad.get(i - 1))) {
                ++thuhang;
            } else {
                ts.put(ad.get(i), ts.get(ad.get(i - 1)) + thuhang);
                thuhang = 1;                
            }
        }
        for (HocSinh hs : a) {
            hs.setRank(ts.get(hs.getGpa()));
        }
        for (HocSinh hs : a) {
            hs.display();
        }
    }
}
