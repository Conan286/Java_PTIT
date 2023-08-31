//B21DCCN441
import java.io.*;
import java.math.*;
import java.util.*;

class GiaoVien {

    private String id, name, chucVu;
    private int bacLuong;
    private long phuCap, thuNhap;

    public GiaoVien(String id, String name, long lcb) {
        this.id = id;
        this.name = name;
        this.chucVu = id.substring(0, 2);
        this.bacLuong = Integer.valueOf(id.substring(2, 4));
        this.phuCap = 2000000;
        if (chucVu.equals("HP")) {
            this.phuCap = 900000;
        } else if (chucVu.equals("GV")) {
            this.phuCap = 500000;
        }
        this.thuNhap = (long) this.bacLuong * lcb + this.phuCap;
    }

    public String getCv() {
        return this.chucVu;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + bacLuong + " " + phuCap + " " + thuNhap;
    }
}

public class J05064_BangThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<GiaoVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong()));
        }
        int hieuTruong = 0, hieuPho = 0;
        for (GiaoVien gv : a) {
            if ((gv.getCv().equals("HT") && hieuTruong > 0) || (gv.getCv().equals("HP") && hieuPho > 1)) {
                continue;
            } else if (gv.getCv().equals("HT") && hieuTruong < 1) {
                hieuTruong += 1;
            } else if (gv.getCv().equals("HP") && hieuPho < 2) {
                hieuPho += 1;
            }
            System.out.println(gv);
        }
    }
}
