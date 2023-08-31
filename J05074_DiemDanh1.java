//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class sinhVien {

    public String id, name, lop;
    public int chuyenCan;

    public sinhVien(String id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public void setDiemChuyenCan(String s) {
        int score = 10;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                continue;
            } else if (s.charAt(i) == 'v') {
                score -= 2;
            } else {
                score -= 1;
            }
        }
        this.chuyenCan = score > 0 ? score : 0;
    }

    @Override
    public String toString() {
        String ans = this.id + " " + this.name + " " + this.lop + " " + this.chuyenCan;
        if (this.chuyenCan == 0) {
            ans += " KDDK";
        }
        return ans;
    }
}

public class J05074_DiemDanh1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<sinhVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String id = s.split(" ")[0];
            String trangThai = s.split(" ")[1];
            for (sinhVien sV : a) {
                if (sV.id.equals(id)) {
                    sV.setDiemChuyenCan(trangThai);
                    break;
                }
            }
        }
        for (sinhVien sV : a) {
            System.out.println(sV);
        }
    }
}
