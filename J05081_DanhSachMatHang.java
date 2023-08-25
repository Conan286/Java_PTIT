//B21DCCN441
import java.io.*;
import java.math.*;
import java.util.*;

class MatHang {

    public String mmh, tmh, dvt;
    public long gm, gb, ln;

    public MatHang(int id, String name, String donvi, long gm, long gb) {
        String tt = String.valueOf(id);
        if (tt.length() == 1) {
            this.mmh = "MH00" + tt;
        } else {
            this.mmh = "MH0" + tt;
        }
        this.tmh = name;
        this.dvt = donvi;
        this.gb = gb;
        this.gm = gm;
        this.ln = gb - gm;
    }

    public void display() {
        System.out.println(mmh + " " + tmh + " " + dvt + " " + gm + " " + gb + " " + ln);
    }
}

public class J05081_DanhSachMatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(a, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang t, MatHang t1) {
                if (t.ln != t1.ln) {
                    return t.ln > t1.ln ? -1 : 1;
                }
                return t.mmh.compareTo(t1.mmh);
            }
        });
        for (MatHang p : a) {
            p.display();
        }
    }
}
