//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class PS {

    public long t, m;

    public PS(long a, long b) {
        t = a;
        m = b;
    }

    public long gcd(long a, long b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public PS add(PS b) {
        long ts = this.t * b.m + this.m * b.t;
        long ms = this.m * b.m;
        PS Add = new PS(ts, ms);
        return rutGon(Add);
    }

    public PS mul(PS b) {
        long ts = this.t * b.t;
        long ms = this.m * b.m;
        PS Mul = new PS(ts, ms);
        return rutGon(Mul);
    }

    public PS rutGon(PS x) {
        long uc = gcd(x.t, x.m);
        return new PS(x.t / uc, x.m / uc);
    }

    @Override
    public String toString() {
        return String.valueOf(t) + "/" + String.valueOf(m);
    }
}

public class J04014_TinhToanPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PS a = new PS(sc.nextLong(), sc.nextLong());
            PS b = new PS(sc.nextLong(), sc.nextLong());
            PS c = a.add(b);
            c = c.mul(c);
            PS d = a.mul(b).mul(c);
            System.out.println(c.t + "/" + c.m + " " + d.t + "/" + d.m);
        }
    }
}
