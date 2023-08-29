//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;

class Sinhvien {

    public String id, ten, lop, mail;

    public Sinhvien(String id, String ten, String lop, String mail) {

        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public void display() {
        System.out.printf("%s %s %s %s\n", id, ten, lop, mail);
    }
}

public class J05020_SapXepSinhVienTheoLop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinhvien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien t, Sinhvien t1) {
                if (!t.lop.equals(t1.lop)) {
                    return t.lop.compareTo(t1.lop);
                }
                return t.id.compareTo(t1.id);
            }
        });
        for (Sinhvien p : a) {
            p.display();
        }
    }
}
