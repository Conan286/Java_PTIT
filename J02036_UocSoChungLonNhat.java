import java.util.*;
import java.io.*;
import java.math.*;
public class J02036_UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int []a = new int[n];
        int []b = new int[n+1];
        for(int i = 0 ; i < n; i++)
            a[i] = sc.nextInt();
        b[0] = a[0];
        b[n] = a[n-1];
        for(int i = 1 ; i <= n-1 ; i++){
            b[i]=lcm(a[i],a[i-1]);
            
        }
        for(int i = 0 ; i <=n ; i++)
            System.out.print(b[i]+" ");
        System.out.println("");
    }
    }
    public static int gcd(int a,int b)
    {
    if(a%b==0) return b;
        return gcd(b,a%b);    
    }
    public static int lcm(int a,int b)
    {
    return a*b/gcd(a,b);    
    }
}
