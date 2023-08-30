//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

class Sv {

    public String id, ten, lop, mail;

    public Sv(String id, String ten, String lop, String mail) {

        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public void display() {
        System.out.printf("%s %s %s %s\n", id, ten, lop, mail);
    }
}

public class J05024_LietKeSinhVienTheoNganh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sv> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String major = sc.nextLine();
            major = major.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + major + ":");
            StringTokenizer ss = new StringTokenizer(major);
            String ans = "";
            while (ss.hasMoreElements()) {
                ans += ss.nextToken().charAt(0);
            }
            ans = "DC" + ans.substring(0, 2);
            if (ans.equals("DCCN") || ans.equals("DCAT")) {
                for (Sv p : a) {
                    if (p.id.contains(ans) && p.lop.charAt(0) != 'E') {
                        p.display();
                    }
                }
            } else {
                for (Sv p : a) {
                    if (p.id.contains(ans)) {
                        p.display();
                    }
                }
            }
        }
    }
}
