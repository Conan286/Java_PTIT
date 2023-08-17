import java.util.*;
public class J01011_BoiSoChungUocSoChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while(t-->0)
        {
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(lcm(a,b)+" "+gcd(a,b));
        }
    }
     public static long lcm(long a,long b)
    {
        return a*b/gcd(a,b);
    }
    public static long gcd(long a,long b)
    {
        if(a%b==0) return b;
        return gcd(b,a%b);
    }     
}

