import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

class UngVien {

    public String name, birth, id, rank;
    public int age, p;
    public double lt, th, dt;

    public UngVien(int id, String name, String birth, double lt, double th) {
        if (id < 10) {
            this.id = "PH0" + String.valueOf(id);
        } else {
            this.id = "PH" + String.valueOf(id);
        }
        StringTokenizer ss = new StringTokenizer(name.toLowerCase());
        String ans = "";
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            char x = (char) (s.charAt(0) - 32);
            ans += x + s.substring(1) + " ";
        }
        this.name = ans.substring(0, ans.length() - 1);
        this.age = 2021 - Integer.valueOf(birth.substring(birth.length() - 4, birth.length()));
        this.lt = lt;
        this.th = th;
        this.dt = (this.lt >= 8 && this.th >= 8) ? 1 : ((this.lt >= 7.5 && this.th >= 7.5) ? 0.5 : 0);
        this.p = (int) Math.round((this.lt + this.th) * 0.5 + this.dt);
        if (this.p > 10) {
            this.p = 10;
        }
        if (this.p > 8) {
            this.rank = "Xuat sac";
        } else if (this.p > 7) {
            this.rank = "Gioi";
        } else if (this.p > 6) {
            this.rank = "Kha";
        } else if (this.p > 4) {
            this.rank = "Trung binh";
        } else {
            this.rank = "Truot";
        }
    }

    public void display() {
        System.out.printf("%s %s %d %d %s\n", id, name, age, p, rank);
    }
}

public class J07053_XetTuyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        ArrayList<UngVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new UngVien(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for (UngVien deptrai : a) {
            deptrai.display();
        }
    }

}
