import java.util.*;
public class J01022_XauNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n =0;
        long k = 0;
        generation();
        while(t-->0)
        {
        
        n = sc.nextInt();
        k = sc.nextLong();
        System.out.println(result(k,n));
        }
    }
    public static int N = 93;
    public static long []len = new long[N];
    public static void generation()
    {
    len[0]=0;
    len[1]=1;
    len[2]=1;
    for(int i = 3;i<N;i++)
        len[i]=len[i-2]+len[i-1];
    
    }
    public static int result(long k,int n)
    {
    if(n==1) return 0;
    if(n==2) return 1;
    if(k==1 && n%2==0) return 1;
    if(k==1 && n%2!=0) return 0;
    if(k>len[n-2]) return result(k-len[n-2],n-1);
    return result(k,n-2);
    }
}
