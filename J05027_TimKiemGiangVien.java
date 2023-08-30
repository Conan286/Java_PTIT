//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class GiangVienDepTrai {

    public String id, name, lastName, boMon;

    public GiangVienDepTrai(int i, String name, String bm) {
        this.id = "";
        if (i < 10) {
            this.id = "GV0" + i;
        } else {
            this.id = "GV" + i;
        }
        this.name = name;
        this.lastName = name.split(" ")[name.split(" ").length - 1];
        StringTokenizer ss = new StringTokenizer(bm.toUpperCase());
        this.boMon = "";
        while (ss.hasMoreTokens()) {
            this.boMon += ss.nextToken().charAt(0);
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + boMon;
    }
}
public class J05027_TimKiemGiangVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVienDepTrai> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new GiangVienDepTrai(i, sc.nextLine(), sc.nextLine()));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String tk = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " +tk + ":");
            tk = tk.toLowerCase();
            for (GiangVienDepTrai dz : a) {
                String ans = dz.name.toLowerCase();                
                if (ans.contains(tk)) {
                    System.out.println(dz);
                }
            }
        }
    }
}
