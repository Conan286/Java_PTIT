import java.util.*;
public class J01021_TinhLuyThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=0,b=0;
        while(true)
        {
        a = sc.nextLong();
        b = sc.nextLong();
        if(a==0 && b==0)
            break;
        else
                System.out.println(pow(a,b));
            
        }
    }
    public static long mod = 1000000007;
    public static long pow(long a,long b)
    {
    if(b==0) return 1;
    long k = pow(a,b/2);
    if(b%2==0) return k%mod*k%mod;
    return ((a%mod)*(k%mod*k%mod)%mod)%mod;    
    }
}
