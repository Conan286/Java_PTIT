//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;

class matHang {

    public String id, name;
    public long soLuong, donGia, chietKhau, tongTien;

    public matHang(String Id, String Name, long Soluong, long Dongia, long Chietkhau) {
        this.id = Id;
        this.name = Name;
        this.soLuong = Soluong;
        this.donGia = Dongia;
        this.chietKhau = Chietkhau;
        this.tongTien = this.soLuong * this.donGia - this.chietKhau;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.soLuong + " " + this.donGia + " " + this.chietKhau + " " + this.tongTien;
    }
}

public class J05012_TinhTien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<matHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new matHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(a, new Comparator<matHang>() {
            @Override
            public int compare(matHang t, matHang t1) {
                return t.tongTien > t1.tongTien ? -1 : 1;
            }
        });
        for (matHang mh : a) {
            System.out.println(mh);
        }
    }
}
