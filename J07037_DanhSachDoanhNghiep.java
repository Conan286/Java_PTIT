
import java.util.*;
import java.io.*;
import java.math.*;

class DoanhNghiep {

    public String tdn, mdn;
    public int ssv;

    public DoanhNghiep(String a, String b, int c) {
        this.mdn = a;
        this.tdn = b;
        this.ssv = c;
    }

    public void display() {
        System.out.println(mdn + " " + tdn + " " + ssv);
    }
}

public class J07037_DanhSachDoanhNghiep {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep t, DoanhNghiep t1) {
                return t.mdn.compareTo(t1.mdn);
            }
        });
        for (DoanhNghiep p : a) {
            p.display();
        }
    }
}
