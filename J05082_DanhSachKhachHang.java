//B21DCCN441
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class KhachHang {

    public String id, name, sex, birth, address;
    public int d, m, y;

    public KhachHang(int i, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.id = "KH" + i;
        if (i < 10) {
            this.id = "KH00" + i;
        } else if (i < 100) {
            this.id = "KH0" + i;
        }
        this.address = diaChi;
        this.sex = gioiTinh;
        this.name = titleName(ten.toLowerCase());
        this.birth = titleDate(ngaySinh);
        this.d = Integer.valueOf(birth.substring(0, 2));
        this.m = Integer.valueOf(birth.substring(3, 5));
        this.y = Integer.valueOf(birth.substring(6, 10));
    }

    public String titleDate(String s) {
        if (s.charAt(1) == '/') {
            s = "0" + s;
        }
        if (s.charAt(4) == '/') {
            s = s.substring(0, 3) + "0" + s.substring(3);
        }
        return s;
    }

    public String titleName(String name) {
        StringTokenizer ss = new StringTokenizer(name);
        String ans = "";
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            char x = (char) (s.charAt(0) - 32);
            ans += x + s.substring(1) + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.sex + " " + this.address + " " + this.birth;
    }
}

public class J05082_DanhSachKhachHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang t, KhachHang t1) {
                if (t.y != t1.y) {
                    return t.y - t1.y;
                } else if (t.m != t1.m) {
                    return t.m - t1.m;
                }
                return t.d - t1.d;
            }
        });
        for (KhachHang kh : a) {
            System.out.println(kh);
        }
    }
}
