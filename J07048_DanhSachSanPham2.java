import java.util.*;
import java.io.*;
import java.math.*;

class Sanpham implements Comparable<Sanpham> {

    public String msp, tsp;
    public int gb, tbh;

    public Sanpham(String a, String b, int c, int d) {
        this.msp = a;
        this.tsp = b;
        this.gb = c;
        this.tbh = d;
    }

    @Override
    public int compareTo(Sanpham t) {
        if(this.gb != t.gb)
        return this.gb > t.gb ? -1 : 1;
        return this.msp.compareTo(t.msp);
    }

    @Override
    public String toString() {
        String ans = msp + " " + tsp + " " + String.valueOf(gb) + " " + String.valueOf(tbh);
        return ans;
    }
}

public class J07048_DanhSachSanPham2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        ArrayList<Sanpham> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new Sanpham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        for (Sanpham sp : a) {
            System.out.println(sp);
        }
    }
}
