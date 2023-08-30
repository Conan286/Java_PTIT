//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;


class SanPham {

    private String id, name;
    private int sl, dg, tck, tt;

    public SanPham(String id, String Name, int sl, int dg) {
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
    public int chietKhau()
    {
    return this.tck;
    }
}

public class J05047_BangKeNhapKhoSapXepTheoChietKhau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SanPham> a = new ArrayList<>();
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
            a.add(new SanPham(id, Name, sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a,new Comparator<SanPham>(){
            @Override
            public int compare(SanPham t, SanPham t1) {
                return t.chietKhau()>t1.chietKhau()?-1:1;
            }
            });
        for (SanPham mh : a) {
            System.out.println(mh);
        }
    }
}