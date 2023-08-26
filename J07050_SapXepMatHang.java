
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class matHang implements Comparable<matHang> {

    public String mh, th, nh;
    public double gm, gb, ln;

    public matHang(int id, String th, String nh, double gm, double gb) {
        if (id < 10) {
            this.mh = "MH0" + String.valueOf(id);
        } else {
            this.mh = "MH" + String.valueOf(id);
        }
        this.th = th;
        this.nh = nh;
        this.gb = gb;
        this.gm = gm;
        this.ln = gb - gm;
    }

    @Override
    public int compareTo(matHang t) {
        return this.ln > t.ln ? -1 : 1;
    }

    public void display() {
        System.out.printf("%s %s %s %.2f\n", mh, th, nh, ln);
    }
    
}

public class J07050_SapXepMatHang {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        ArrayList<matHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new matHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        for (matHang mh : a) {
            mh.display();
        }
    }
}
