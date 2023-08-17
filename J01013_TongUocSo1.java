import java.util.*;
public class J01013_TongUocSo1 {
     public static int N = 2000001;
    public static int []a = new int[N];
    public static void Eratosthenes() {
        for(int i = 2;i<N;i++)
            a[i] = 1;
        int k = (int)Math.sqrt(N);
        for(int i=2;i<k;i++)
            if(a[i]==1)
            for(int j = i*i;j<N;j+=i)
                a[j]=0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        Eratosthenes() ;
        long k = 0;
        while(t-->0)
        {
        int n = sc.nextInt();       
        k += ptit(n);
        }
        System.out.println(k);
    }
    public static long ptit(int n)
    {
    if(a[n]==1) return (long)n;
    long ans = 0;
    for(int i = 2; i<=(int)Math.sqrt(n);i++)
    {
    while(n%i==0)
    {
    n/=i;
    ans+=(long)i;
    }
    if(n==1) break;
    }
    if(n>1) ans+=(long)n;
    return ans;
    }
}
