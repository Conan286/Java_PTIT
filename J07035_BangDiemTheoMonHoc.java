//B21DCCN441

import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.*;

class SinhVien {

    private String id, name, lop, email;

    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.email = email;
        this.name = title(name);
        this.lop = lop;
    }

    public String title(String s) {
        StringTokenizer ss = new StringTokenizer(s.toLowerCase());
        String ans = "";
        while (ss.hasMoreTokens()) {
            String t = ss.nextToken();
            char x = (char) (t.charAt(0) - 32);
            ans += x + t.substring(1) + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLop() {
        return this.lop;
    }
}

class monHoc {

    private String id, name;
    private int stc;

    public monHoc(String a, String b, int c) {
        this.id = a;
        this.name = b;
        this.stc = c;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getStc() {
        return this.stc;
    }
}

class bangDiem {

    private SinhVien sv;
    private monHoc mh;
    private double score;

    public bangDiem(SinhVien a, monHoc b, double c) {
        this.sv = a;
        this.mh = b;
        this.score = c;
    }

    public String getLopHoc() {
        return this.sv.getLop();
    }

    public String getIdSub() {
        return this.mh.getId();
    }

    public String getNameSub() {
        return this.mh.getName();
    }

    public String getId() {
        return this.sv.getId();
    }

    public double getScore() {
        return this.score;
    }

    public void display() {
        String ans = this.sv.getId() + " " + this.sv.getName() + " " + this.sv.getLop() + " ";
        System.out.printf(ans);
        int k = (int) (this.score);
        if (this.score - k > 0) {
            System.out.println(this.score);
        } else {
            System.out.println(k);
        }
    }
}

public class J07035_BangDiemTheoMonHoc {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        TreeMap<String, SinhVien> tsSinhVien = new TreeMap<>();
        TreeMap<String, monHoc> tsmonHoc = new TreeMap<>();
        TreeMap<String, String> nameOfSub = new TreeMap<>();
        ArrayList<bangDiem> abangDiem = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String id = sc.nextLine();
            tsSinhVien.put(id, new SinhVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MONHOC.in"));
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            nameOfSub.put(id, name);
            tsmonHoc.put(id, new monHoc(id, name, sc.nextInt()));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= k; i++) {
            String s = sc.nextLine();
            String id = s.split(" ")[0];
            String name = s.split(" ")[1];
            double c = Double.valueOf(s.split(" ")[2]);
            abangDiem.add(new bangDiem(tsSinhVien.get(id), tsmonHoc.get(name), c));
        }
        Collections.sort(abangDiem, new Comparator<bangDiem>() {
            @Override
            public int compare(bangDiem t, bangDiem t1) {
                if (t.getScore() != t1.getScore()) {
                    return t.getScore() > t1.getScore() ? -1 : 1;
                }
                return t.getId().compareTo(t1.getId());
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String search = sc.nextLine();
            search = nameOfSub.get(search);
            System.out.println("BANG DIEM MON " + search + ":");
            for (bangDiem bd : abangDiem) {
                if (bd.getNameSub().equals(search)) {
                    bd.display();
                }
            }
        }

    }
}
