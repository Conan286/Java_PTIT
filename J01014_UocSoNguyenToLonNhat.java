import java.util.*;
public class J01014_UocSoNguyenToLonNhat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
       
        while(t-->0)
        {
        long n = sc.nextLong();       
        System.out.println(ptit(n));
        }
    
    }
    public static long ptit(long n)
    {
    long ans=1;
    for(int i = 2;i<=(int)Math.sqrt(n);i++)
    {
    if(n%i==0){
    while(n%i==0)
    n/=i;
    long j = (long)i;
    ans=ans>j?ans:j;
    }
    if(n==1) break;
    }
    ans=ans>n?ans:n;
    return ans;
    }
}
