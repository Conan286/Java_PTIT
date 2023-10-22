//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;

class PhanSo {

    private long t, m;

    public PhanSo() {
        this.t = 0;
        this.m = 0;
    }

    public PhanSo(long x, long y) {
        this.t = x;
        this.m = y;
    }

    public long gcd(long a, long b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }

    public void print() {
        System.out.println(t / gcd(t, m) + "/" + m / gcd(t, m));
    }
}

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        a.print();
    }
}
