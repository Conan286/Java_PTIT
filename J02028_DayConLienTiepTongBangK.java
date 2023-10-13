import java.util.*;
import java.math.*;
import java.io.*;

public class J02028_DayConLienTiepTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0)
        {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long []a = new long[n];
        for(int i=0;i<n;i++) a[i] = sc.nextLong();
        if(check(a,n,k)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check(long a[],int n,long k)
    {
    long s = 0;
    Deque<Long> dq = new ArrayDeque<>();
    int check0 = 0;
    for(int i=0;i<n;i++)
    {
    s += a[i];
    if(a[i]==0) check0=1;
    
    dq.push(a[i]);
        
    while(s>k) {
    s -= dq.pollLast();    
    }
    
    if(s==k && s>0) return true;
       
    }
    if(k==0 && check0==1) return true;
    return false;
    }
}
