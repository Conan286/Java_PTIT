import java.io.*;
import java.util.*;
import java.math.*;

class NhanVien {

    public String mnv, ht, gt, ns, dc, mst, nkhd;
    public int d, m, y;

    public NhanVien(String mnv, String ht, String gt, String ns, String dc, String mst, String nkhd) {
        this.mnv = mnv;
        this.ht = ht;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.nkhd = nkhd;
        this.mst = mst;
        this.d = Integer.valueOf(ns.substring(0, 2));
        this.m = Integer.valueOf(ns.substring(3, 5));
        this.y = Integer.valueOf(ns.substring(6, 10));

    }

    public String toString() {
        return mnv + " " + ht + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }
}

public class J05007_SapXepDanhSachDoiTuongNhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String id = "";
            if (i < 10) {
                id = "0000" + i;
            } else if (i < 100) {
                id = "000" + i;
            } else if (i < 1000) {
                id = "00" + i;
            } else {
                id = "0" + i;
            }
            a.add(new NhanVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
                if (t.y != t1.y) {
                    return t.y > t1.y ? 1 : -1;
                } else if (t.m != t1.m) {
                    return t.m > t1.m ? 1 : -1;
                } else {
                    return t.d > t1.d ? 1 : -1;
                }
            }
        });

        for (NhanVien deptrai : a) {
            System.out.println(deptrai);
        }
    }
}
