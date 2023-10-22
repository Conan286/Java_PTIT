//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;

class PS {
    private long t, m;
    public PS() {
        this.t = 0;
        this.m = 0;
    }

    public PS(long x, long y) {
        this.t = x;
        this.m = y;
    }

    public PS sum(PS v)
    {
    long mau = lcm(this.m,v.m);
    long tu = (mau/this.m)*this.t + (mau/v.m)*v.t;
    long uc = gcd(mau,tu);
    return new PS(tu/uc,mau/uc);
    }
    
    public long gcd(long a, long b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
    public long lcm(long a, long b) {
        return a*b/gcd(a,b);
    }

    public void print() {
        System.out.println(t / gcd(t, m) + "/" + m / gcd(t, m));
    }
}

public class bai7{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS a = new PS(sc.nextLong(), sc.nextLong());
        PS b = new PS(sc.nextLong(), sc.nextLong());
        PS c = a.sum(b);
        c.print();
    }
}