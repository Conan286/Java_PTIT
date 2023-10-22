import java.io.*;
import java.util.*;
import java.math.*;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        long n = sc.nextLong();
        System.out.println(ans(n));
        }
    }
    public static long ans(long n)
    {
    long res = n;
    for(int i=2;i<=Math.sqrt(n);i++)
    {
    if(n%i==0){
    res = i;
    while(n%i==0)
    n/=i;
    }
    }
    if(n>1) return n;
    return res;
    }
}
