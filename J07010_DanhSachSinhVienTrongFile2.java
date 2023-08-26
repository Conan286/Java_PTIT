import java.util.*;
import java.io.*;
import java.math.*;

class SV implements Comparable<SV> {

    String ten, lop, ns, msv;
    double gpa;

    public SV(int id, String ten, String lop, String ns, double gpa) {
        if (id < 10) {
            msv = "B20DCCN00" + String.valueOf(id);
        } else {
            msv = "B20DCCN0" + String.valueOf(id);
        }
        if (ns.charAt(1) == '/') {
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/') {
            ns = ns.substring(0, 3) + "0" + ns.substring(3);
        }
        this.ns = ns;
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
    }

    public void display() {

        System.out.printf("%s %s %s %s %.2f\n", msv, ten, lop, ns, gpa);
    }

    @Override
    public int compareTo(SV t) {
        return 1;
    }

}

public class J07010_DanhSachSinhVienTrongFile2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        ArrayList<SV> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new SV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        for (SV p : a) {
            p.display();
        }
    }
}
