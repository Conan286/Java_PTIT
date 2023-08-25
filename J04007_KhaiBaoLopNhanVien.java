
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

public class J04007_KhaiBaoLopNhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien y = new NhanVien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        y.print();
    }
}
