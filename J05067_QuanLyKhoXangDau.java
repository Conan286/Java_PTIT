//B21DCCN441
import java.util.*;
import java.math.*;
import java.io.*;

class XangDau {

    private String id, maHang, hangSanXuat;
    private long donGia, tax, thanhTien, soLuong;

    public XangDau(String s) {
        this.id = s.split(" ")[0];
        this.soLuong = (long) Integer.valueOf(s.split(" ")[1]);
        this.maHang = this.id.substring(0, 1);
        switch (this.maHang) {
            case "X":
                this.donGia = 128000;
                this.tax = this.donGia * this.soLuong * 3 / 100;
                break;
            case "D":
                this.donGia = 11200;
                this.tax = this.donGia * this.soLuong * 35 / 1000;
                break;
            case "N":
                this.donGia = 9700;
                this.tax = this.donGia * this.soLuong * 2 / 100;
                break;
        }

        this.hangSanXuat = "";
        switch (this.id.substring(3, 5)) {
            case "BP":
                this.hangSanXuat = "British Petro";
                break;
            case "ES":
                this.hangSanXuat = "Esso";
                break;
            case "SH":
                this.hangSanXuat = "Shell";
                break;
            case "CA":
                this.hangSanXuat = "Castrol";
                break;
            case "MO":
                this.hangSanXuat = "Mobil";
                break;
            default:
                this.hangSanXuat = "Trong Nuoc";
                this.tax = 0;
                break;
        }
        this.thanhTien = this.donGia * this.soLuong + this.tax;
    }

    @Override
    public String toString() {
        return id + " " + hangSanXuat + " " + donGia + " " + tax + " " + thanhTien;
    }
}

public class J05067_QuanLyKhoXangDau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<XangDau> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new XangDau(sc.nextLine()));
        }
        for (XangDau xd : a) {
            System.out.println(xd);
        }
    }
}
