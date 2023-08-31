//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class ThiSinh {

    private String id, name, trangThai;
    private double toan, ly, hoa, diemUuTien, tongDiem, diemXetTuyen;

    public ThiSinh(String id, String name, double t, double l, double h) {
        this.id = id;
        this.name = name;
        this.toan = t;
        this.ly = l;
        this.hoa = h;
        this.tongDiem = t + t + l + h;
        this.diemUuTien = 0.5;
        if (id.substring(0, 3).equals("KV2")) {
            this.diemUuTien = 1;
        } else if (id.substring(0, 3).equals("KV3")) {
            this.diemUuTien = 2.5;
        }
        this.diemXetTuyen = this.tongDiem + this.diemUuTien;
        this.trangThai = "TRUNG TUYEN";
        if (this.tongDiem + this.diemUuTien < 24) {
            this.trangThai = "TRUOT";
        }
    }

    public String getId() {
        return this.id;
    }

    public double getDiemXetTuyen() {
        return this.diemXetTuyen;
    }

    public void display() {
        if (id.subSequence(0, 3).equals("KV2")) {
            System.out.printf("%s %s %.0f ", id, name, diemUuTien);
        } else {
            System.out.printf("%s %s %.1f ", id, name, diemUuTien);
        }
        int k = (int) diemXetTuyen;
        if (diemXetTuyen - k > 0) {
            System.out.printf("%.1f %s\n", diemXetTuyen, trangThai);
        } else {
            System.out.printf("%.0f %s\n", diemXetTuyen, trangThai);
        }
    }
}

public class J05058_SapXepKetQuaTuyenSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh t, ThiSinh t1) {
                if (!Objects.equals(t.getDiemXetTuyen(), t1.getDiemXetTuyen())) {
                    return t.getDiemXetTuyen() < t1.getDiemXetTuyen() ? 1 : -1;
                }
                return t.getId().compareTo(t1.getId());
            }
        });
        for (ThiSinh tS : a) {
            tS.display();
        }
    }
}
