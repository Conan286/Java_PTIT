import java.io.*;
import java.math.*;
import java.util.*;

class pS{
private long t,m;
public pS(long t,long m)
{
 long uc = gcd(t,m);
 this.t = t/uc;
 this.m = m/uc;
}
public long gcd(long a,long b)
{
return (a%b==0)?b:gcd(b,a%b);
}
@Override
public String toString()
{
return this.t+"/"+this.m;
}
}
public class BaiTap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pS i = new pS(sc.nextLong(),sc.nextLong());
        System.out.println(i);
    }
}
