//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class MatHang {

    private String id, name;
    private int sl, dg, tck, tt;

    public MatHang(String id, String Name, int sl, int dg) {
        this.name = Name;
        this.id = id;

        this.sl = sl;
        this.dg = dg;
        this.tck = 0;
        if (this.sl > 10) {
            this.tck = this.sl * this.dg * 5 / 100;
        } else if (this.sl >= 8) {
            this.tck = this.sl * this.dg * 2 / 100;
        } else if (this.sl >= 5) {
            this.tck = this.sl * this.dg / 100;
        }
        this.tt = this.sl * this.dg - this.tck;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.tck + " " + this.tt;
    }
}

public class J05046_BangKeNhapKho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        TreeMap<String, Integer> ts = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String Name = sc.nextLine();
            String id = "" + Name.split(" ")[0].toUpperCase().charAt(0) + Name.split(" ")[1].toUpperCase().charAt(0);
            if (ts.containsKey(id)) {
                int v = ts.get(id) + 1;
                ts.put(id, v);
                if (v < 10) {
                    id += "0" + v;
                } else {
                    id += "" + v;
                }
            } else {
                ts.put(id, 1);
                id += "01";
            }
            a.add(new MatHang(id, Name, sc.nextInt(), sc.nextInt()));
        }
        for (MatHang mh : a) {
            System.out.println(mh);
        }
    }
}
