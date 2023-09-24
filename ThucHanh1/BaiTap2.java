import java.math.*;
import java.util.*;
import java.io.*;

public class BaiTap2 {
    public static long gcd(long a,long b)
    {
    if(a%b==0) return b;
    return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long g = gcd(a,b);
        long m = a*b/g;
        System.out.println(m+" "+g);
        }
    }
}
