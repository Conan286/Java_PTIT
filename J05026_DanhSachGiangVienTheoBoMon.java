//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class GiangVien {

    public String id, name, lastName, boMon;

    public GiangVien(int i, String name, String bm) {
        this.id = "";
        if (i < 10) {
            this.id = "GV0" + i;
        } else {
            this.id = "GV" + i;
        }
        this.name = name;
        this.lastName = name.split(" ")[name.split(" ").length - 1];
        StringTokenizer ss = new StringTokenizer(bm.toUpperCase());
        this.boMon = "";
        while (ss.hasMoreTokens()) {
            this.boMon += ss.nextToken().charAt(0);
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + boMon;
    }
}

public class J05026_DanhSachGiangVienTheoBoMon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new GiangVien(i, sc.nextLine(), sc.nextLine()));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String bm = sc.nextLine();
            StringTokenizer ss = new StringTokenizer(bm.toUpperCase());
            String ans = "";
            while (ss.hasMoreTokens()) {
                ans += ss.nextToken().charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + ans + ":");
            for (GiangVien dz : a) {
                if (dz.boMon.equals(ans)) {
                    System.out.println(dz);
                }
            }
        }
    }
}
