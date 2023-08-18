import java.util.*;
import java.io.*;
import java.math.*;
 public class J02016_BoBaSoPytago { 
     public static boolean check(long []a,int n)
     {
        for(int i = n-1; i>=2;i--)
        {
        long h = a[i];
        int l = 0, r = i-1;
        while(l<r)
        {
        if(a[l]+a[r]==a[i]) return true;
        else if(a[l]+a[r]<a[i]) 
        ++l;
        else if(a[l]+a[r]>a[i]) r--;
        }        
        }
        return false;
     }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        int n = sc.nextInt();
        
        long []a = new long[n];
        for(int i = 0 ; i < n; i++){
            a[i]= sc.nextLong();
            a[i]*=a[i];
        }
        Arrays.sort(a);
        
        if(check(a,n)) System.out.println("YES");
        else System.out.println("NO");   
        
        }
    }
 }
