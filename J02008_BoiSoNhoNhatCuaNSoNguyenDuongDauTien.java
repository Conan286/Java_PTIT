import java.util.*;
public class J02008_BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        generation();
        while(t-->0)
        {
        int n = sc.nextInt();
        System.out.println(bc[n]);
        }
    }
    public static int N = 101;
    public static long []bc = new long[N];
    public static long gcd(long a,long b)
    {
    if(a%b==0) return b;
    return gcd(b,a%b);
    }
    public static long lcm(long a,long b)
    {
    return a*b/gcd(a,b);
    }
    public static void generation()
    {
        bc[0] = bc [1] = 1;
        bc [2] = 2;
        for(int i = 3;i<N;i++)
        {
        long j = (long)i;
        bc[i] = lcm(j,bc[i-1]);
        }
        
    }
}
