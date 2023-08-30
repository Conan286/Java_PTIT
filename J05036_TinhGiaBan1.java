//B21DCCN441
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

class HangHoa {

    private String id, th, dvt;
    private int dgn, sl, pvc, tt, gb;

    public HangHoa(int i, String th, String dvt, int dgn, int sl) {
        this.id = "";
        if (i < 10) {
            this.id = "MH0" + i;
        } else {
            this.id = "MH" + i;
        }
        this.th = th;
        this.dvt = dvt;
        this.dgn = dgn;
        this.sl = sl;
        double ship = this.dgn * this.sl * 5 / 100;
        this.pvc = round(ship);
        double thanhtien = this.dgn * this.sl + ship;
        this.tt = round(thanhtien);
        double giaban = thanhtien + thanhtien * 0.02;
        this.gb = round(giaban);
    }

    public int round(double ship) {
        int k = (int) ship;
        double h = ship - k;
        if (h >= 0.5) {
            k += 1;
        }
        return k;
    }

    @Override
    public String toString() {
        return this.id + " " + this.th + " " + this.dvt + " " + this.pvc + " " + this.tt + " " + this.gb;
    }
}

public class J05036_TinhGiaBan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HangHoa> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new HangHoa(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        for (HangHoa hh : a) {
            System.out.println(hh);
        }
    }
}
