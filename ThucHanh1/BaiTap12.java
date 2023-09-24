import java.io.*;
import java.math.*;
import java.util.*;

class PS{
private long t,m;
public PS(long t,long m)
{
 long uc = gcd(t,m);
 this.t = t/uc;
 this.m = m/uc;
}
public long gcd(long a,long b)
{
return (a%b==0)?b:gcd(b,a%b);
}
public PS add(PS i2)
{
long tu = this.t*i2.m+this.m*i2.t;
long mau = this.m*i2.m;
return new PS(tu,mau);
}
@Override
public String toString()
{
return this.t+"/"+this.m;
}
}
public class BaiTap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS i1 = new PS(sc.nextLong(),sc.nextLong());
        PS i2 = new PS(sc.nextLong(),sc.nextLong());
        System.out.println(i1.add(i2));
    }
}

