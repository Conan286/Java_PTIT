//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class matHang {
    
    private String id, name;
    private int sln, slx;
    private long dg, t, thue;
    
    public matHang(String id, int sln) {
        this.id = id;
        this.sln = sln;
        this.dg = 135000;
        if (id.charAt(4) == 'Y') {
            this.dg = 110000;
        }
        double xuat = 0.0;
        if (id.charAt(0) == 'A') {
            xuat = sln * 0.6;
        } else if (id.charAt(0) == 'B') {
            xuat = sln * 0.7;
        }
        int Ix = (int) xuat;
        double mod = xuat - Ix;
        if (mod >= 0.5) {
            Ix += 1;
        }
        this.slx = Ix;
        this.t = (long) this.slx * this.dg;
        
        if (id.charAt(0) == 'A' && id.charAt(4) == 'Y') {
            this.thue = this.t * 8 / 100;
            
        } else if (id.charAt(0) == 'A' && id.charAt(4) == 'N') {
            this.thue = this.t * 11 / 100;
            
        } else if (id.charAt(0) == 'B' && id.charAt(4) == 'Y') {
            this.thue = this.t * 17 / 100;
            
        } else if (id.charAt(0) == 'B' && id.charAt(4) == 'N') {
            this.thue = this.t * 22 / 100;
        }
        
    }
    
    @Override
    public String toString() {
        return id + " " + sln + " " + slx + " " + dg + " " + t + " " + this.thue;
    }

    public long Thue() {
        return this.thue;
    }

    public String maHang() {
        return this.id.substring(0, 1);
    }
}

public class J05049_LietKeNhapXuatHangTheoNhom {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<matHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new matHang(sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<matHang>() {
            @Override
            public int compare(matHang t, matHang t1) {
                return t.Thue() > t1.Thue() ? -1 : 1;
            }
        });
        sc.nextLine();
        String search = sc.nextLine();
        for (matHang hh : a) {
            if (hh.maHang().equals(search)) {
                System.out.println(hh);
            }
        }
    }
}
