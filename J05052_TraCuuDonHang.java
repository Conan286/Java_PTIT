//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;

class DonHang {

    private String name, id, stt;
    private long dg, sl, gg, tt;

    public DonHang(String tenHang, String maDon, long dg, long sl) {
        this.name = tenHang;
        this.id = maDon;
        this.stt = maDon.substring(1, 4);
        this.sl = sl;
        this.dg = dg;
        this.gg = dg * 50 * sl / 100;
        if (maDon.charAt(4) == '2') {
            this.gg = dg * 30 * sl / 100;
        }
        this.tt = this.sl * this.dg - this.gg;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + stt + " " + gg + " " + tt;
    }
}

public class J05052_TraCuuDonHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new DonHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        for (DonHang dh : a) {
            System.out.println(dh);
        }
    }
}
