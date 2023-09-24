//B21DCCN441
import java.math.*;
import java.util.*;
import java.io.*;
public class BaiTap3 {
    public static int N = 2000001;
    public static int []a = new int[N];
    public static void generation()
    {
    for(int i=0;i<N;i++) a[i] = i;
    int k = (int)Math.sqrt(N);
    for(int i=2;i<k;i++)
        if(a[i]==i)
            for(int j=i*i;j<N;j+=i)
                a[j]=i;
    }
    public static int p(int n)
    {
        if(a[n]==n) return n;
        int sum = 0;
        while(n>1){ sum+=a[n]; n/=a[n];}
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generation();
        long sum = 0;
        for(int i =0;i<n;i++)
        {
        int k = sc.nextInt();
        sum+=p(k);
        }
        System.out.println(sum);
    }
}
