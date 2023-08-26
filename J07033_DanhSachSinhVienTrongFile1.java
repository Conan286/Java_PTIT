import java.util.*;
import java.io.*;
import java.math.*;

class Sinhvien {

    public String id, ten, lop, mail;

    public Sinhvien(String id, String ten, String lop, String mail) {
        ten = ten.toLowerCase();
        StringTokenizer ss = new StringTokenizer(ten);
        String ans = "";
        while (ss.hasMoreTokens()) {
            String s = ss.nextToken();
            char x = (char) (s.charAt(0) - 32);
            ans += x + s.substring(1) + " ";
        }
        ans = ans.substring(0, ans.length() - 1);
        this.id = id;
        this.ten = ans;
        this.lop = lop;
        this.mail = mail;
    }

    public void display() {
        System.out.printf("%s %s %s %s\n", id, ten, lop, mail);
    }
}

public class J07033_DanhSachSinhVienTrongFile1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinhvien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien t, Sinhvien t1) {
                return t.id.compareTo(t1.id);
            }
        });
        for (Sinhvien p : a) {
            p.display();
        }
    }
}
