//B21DCCN441
import java.util.*;
import java.math.*;
import java.io.*;

class ThiSinh {

    public String id, name, trangThai;
    public float lt, th, tb;

    public ThiSinh(int i, String name, float lyThuyet, float thucHanh) {
        this.id = "TS" + i;
        if (i < 10) {
            this.id = "TS0" + i;
        }
        this.name = name;
        if (lyThuyet > 10) {
            lyThuyet /= 10;
        }
        if (thucHanh > 10) {
            thucHanh /= 10;
        }
        this.lt = lyThuyet;
        this.th = thucHanh;
        this.tb = (this.lt + this.th) / 2;
        this.trangThai = "TRUOT";
        if (this.tb > 9.5) {
            this.trangThai = "XUAT SAC";
        } else if (this.tb >= 8) {
            this.trangThai = "DAT";
        } else if (this.tb >= 5) {
            this.trangThai = "CAN NHAC";
        }
    }

    public void display() {
        System.out.printf("%s %s %.2f %s\n", this.id, this.name, this.tb, this.trangThai);
    }
}

public class J05013_TuyenDung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new ThiSinh(i, sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
        Collections.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh t, ThiSinh t1) {
                return t.tb > t1.tb ? -1 : 1;
            }
        });
        for (ThiSinh ts : a) {
            ts.display();
        }
    }
}
