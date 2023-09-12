//B21DCCN441
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class MatHang {

    private String id, name, rank;
    private long costIn, costOut;
    private long rate, in, out, fee;

    public MatHang(String ma, String ten, String xeploai) {
        this.id = ma;
        this.name = ten;
        this.rank = xeploai;
        this.rate = 2;
        if (this.rank.equals("A")) {
            this.rate = 8;
        } else if (this.rank.equals("B")) {
            this.rate = 5;
        }
    }

    public void setCostIn(long c) {
        this.costIn = c * this.in;
    }

    public void setCostOut(long c) {
        this.costOut = c * this.out * (100 + this.rate) / 100;
    }

    public void setFee(long c) {
        this.fee = c;
    }

    public void setIn(long c) {
        this.in = c;
    }

    public void setOut(long c) {
        this.out = c;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.costIn + " " + this.costOut;
    }
}

public class J05076_NhapXuatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0) {
            String s = sc.nextLine();
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getId().equals(s.split(" ")[0])) {
                    a.get(i).setIn((long) Integer.valueOf(s.split(" ")[1]));
                    a.get(i).setFee((long) Integer.valueOf(s.split(" ")[2]));
                    a.get(i).setOut((long) Integer.valueOf(s.split(" ")[3]));
                    a.get(i).setCostIn((long) Integer.valueOf(s.split(" ")[2]));
                    a.get(i).setCostOut((long) Integer.valueOf(s.split(" ")[2]));
                    System.out.println(a.get(i));
                    break;
                }
            }
        }
    }
}
