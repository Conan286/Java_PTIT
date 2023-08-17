import java.util.*;
import java.io.*;
public class J02022_SoXaCach {
    public static int n,ok;
    public static int []a = new int [101];
    public static void begin()
    {
    for(int i = 1; i<=n;i++)
        a[i]=i;
    }
    public static void generate()
    {
    int i = n-1;
    while(i>0 && a[i]>a[i+1])
        i--;
    if(i==0) ok = 0;
    else
    {
    int j = n;
    while(a[i]>a[j]) j--;
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
    int l = i+1,r=n;
    while(l<r)
    {
    tmp = a[l];
    a[l++] = a[r];
    a[r--] = tmp;
    }
    }
    }
    public static void print()
    {
    for(int i = 1; i<=n;i++)
            System.out.print(a[i]);
        System.out.println("");
    }
    public static boolean check()
    {    
    for(int i = 2;i<=n;i++)
        if(Math.abs(a[i]-a[i-1])==1)
            return false;
    return true;
                  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        n = sc.nextInt();
        ok = 1;
        begin();
        while(ok>0)
        {
        if(check()) print();
        generate();
        }
        }
    }
}
