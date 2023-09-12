//B21DCCN441
import java.util.*;
import java.math.*;
import java.io.*;

class nhanVien {

    public String name, id, group, idPhongBan;
    public long namCongTac, heSo, soNgayCong, Luong;

    public nhanVien(String id, String maPhongBan, String name, long luong, long songay) {
        this.id = id;
        this.group = id.substring(0, 1);
        this.idPhongBan = maPhongBan;
        this.name = name;
        this.namCongTac = Integer.valueOf(id.substring(1, 3));
        this.soNgayCong = songay;
        this.heSo = heso(group, namCongTac);
        this.Luong = this.heSo * this.soNgayCong * luong * 1000;
    }

    public long heso(String g, long y) {
        if (g.equals("A")) {
            if (y <= 3) {
                return 10;
            } else if (y <= 8) {
                return 12;
            } else if (y <= 15) {
                return 14;
            }
            return 20;
        } else if (g.equals("B")) {
            if (y <= 3) {
                return 10;
            } else if (y <= 8) {
                return 11;
            } else if (y <= 15) {
                return 13;
            }
            return 16;
        } else if (g.equals("C")) {
            if (y <= 3) {
                return 9;
            } else if (y <= 8) {
                return 10;
            } else if (y <= 15) {
                return 12;
            }
            return 14;
        }
        if (y <= 3) {
            return 8;
        } else if (y <= 8) {
            return 9;
        } else if (y <= 15) {
            return 11;
        }
        return 13;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + idPhongBan + " " + Luong;
    }

}

public class TN02012_TinhLuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> tm = new TreeMap<>();
        int soPhongBan = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soPhongBan; i++) {
            String s = sc.nextLine();
            ArrayList<String> pb = new ArrayList<>();
            StringTokenizer ss = new StringTokenizer(s);
            while (ss.hasMoreTokens()) {
                pb.add(ss.nextToken());
            }
            String maPhongBan = pb.get(0);
            String tenPhongBan = "";
            for (int j = 1; j < pb.size(); j++) {
                tenPhongBan += pb.get(j) + " ";
            }
            tenPhongBan = tenPhongBan.substring(0, tenPhongBan.length() - 1);
            tm.put(maPhongBan, tenPhongBan);
        }
        int n = sc.nextInt();
        ArrayList<nhanVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            a.add(new nhanVien(id, tm.get(id.substring(3, 5)), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        for (nhanVien e : a) {
            System.out.println(e);
        }
    }
}
