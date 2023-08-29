//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

class sinhVien {

    public String id, ten, lop, mail;

    public sinhVien(String id, String ten, String lop, String mail) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public void display() {
        System.out.printf("%s %s %s %s\n", id, ten, lop, mail);
    }
}

public class J05023_LietKeSinhVienTheoKhoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<sinhVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String khoa = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            for (sinhVien p : a) {
                if (p.lop.substring(1, 3).equals(khoa.substring(2))) {
                    p.display();
                }
            }
        }
    }
}
