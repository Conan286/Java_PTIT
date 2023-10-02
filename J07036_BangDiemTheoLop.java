//B21DCCN441
import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.*;

class SV {

    private String id, name, lop, email;

    public SV(String id, String name, String lop, String email) {
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

class MH {

    private String id, name;
    private int stc;

    public MH(String a, String b, int c) {
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

class BD {

    private SV sv;
    private MH mh;
    private double score;

    public BD(SV a, MH b, double c) {
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

    public String getId() {
        return this.sv.getId();
    }

    public void display() {
        String ans = this.sv.getId() + " " + this.sv.getName() + " " + this.mh.getId() + " " + this.mh.getName() + " ";
        System.out.printf(ans);
        int k = (int) (this.score);
        if (this.score - k > 0) {
            System.out.println(this.score);
        } else {
            System.out.println(k);
        }
    }
}

public class J07036_BangDiemTheoLop {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        TreeMap<String, SV> tsSV = new TreeMap<>();
        TreeMap<String, MH> tsMH = new TreeMap<>();
        ArrayList<BD> aBD = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String id = sc.nextLine();
            tsSV.put(id, new SV(id, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MONHOC.in"));
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            tsMH.put(id, new MH(id, sc.nextLine(), sc.nextInt()));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= k; i++) {
            String s = sc.nextLine();
            String id = s.split(" ")[0];
            String name = s.split(" ")[1];
            double c = Double.valueOf(s.split(" ")[2]);
            aBD.add(new BD(tsSV.get(id), tsMH.get(name), c));
        }
        Collections.sort(aBD, new Comparator<BD>() {
            @Override
            public int compare(BD t, BD t1) {
                if (!t.getIdSub().equals(t1.getIdSub())) {
                    return t.getIdSub().compareTo(t1.getIdSub());
                }
                return t.getId().compareTo(t1.getId());
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String search = sc.nextLine();
            System.out.println("BANG DIEM lop " + search + ":");
            for (BD bd : aBD) {
                if (bd.getLopHoc().equals(search)) {
                    bd.display();
                }
            }
        }

    }
}
