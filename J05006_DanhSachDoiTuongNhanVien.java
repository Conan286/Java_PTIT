
import java.io.*;
import java.util.*;
import java.math.*;

class NhanVien {

    private String mnv, ht, gt, ns, dc, mst, nkhd;

    public NhanVien(String mnv, String ht, String gt, String ns, String dc, String mst, String nkhd) {
        this.mnv = mnv;
        this.ht = ht;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.nkhd = nkhd;
        this.mst = mst;

    }

    public void print() {
        System.out.printf("%s %s %s %s %s %s %s\n", mnv, ht, gt, ns, dc, mst, nkhd);
    }
}

public class J05006_DanhSachDoiTuongNhanVien {

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
            } else if (i < 10000) {
                id = "0" + i;
            }
            a.add(new NhanVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (NhanVien y : a) {
            y.print();
        }
    }
}
