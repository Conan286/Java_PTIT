//B21DCCN441 - Giai tri cung jav
import java.util.*;
import java.io.*;
import java.math.*;

class DoanhNghiep {

    public String tdn, mdn;
    public int ssv;

    public DoanhNghiep(String a, String b, int c) {
        this.mdn = a;
        this.tdn = b;
        this.ssv = c;
    }

    public void display() {
        System.out.println(mdn + " " + tdn + " " + ssv);
    }
}

public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep t, DoanhNghiep t1) {
                if(t.ssv!=t1.ssv)
                    return t.ssv>t1.ssv?-1:1;
                return t.mdn.compareTo(t1.mdn);
            }
        });
        for (DoanhNghiep p : a) {
            p.display();
        }
    }
}
