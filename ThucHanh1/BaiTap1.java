import java.math.*;
import java.util.*;
import java.io.*;
public class BaiTap1 {
    public static long []a = new long[94];
    public static void generate()
    {
    a[0] = 0;
    a[1] = 1;
    for(int i = 2;i<94;i++)
        a[i] = a[i-1]+a[i-2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        generate();
        while(t-->0)
        {
        long k = sc.nextLong();
        int check = 0;
        for(int i = 0;i<94;i++){
            if(a[i]==k)
            {
                check = 1;
                System.out.println("YES");
                break;
            }
            if(a[i]>k) break;
        }
        if(check==0) System.out.println("NO");
        }
    }
}
