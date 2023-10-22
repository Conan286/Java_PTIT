import java.io.*;
import java.util.*;
import java.math.*;
public class bai2 {

    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String n = sc.next();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check(String n)
    {
        int sum = n.charAt(0)-'0';
        int len = n.length();
        for(int i=1;i<len;i++)
        {
        if( Math.abs(n.charAt(i)-n.charAt(i-1))!=2) return false;
        sum += n.charAt(i)-'0';
        }
        return sum%10==0;
    }
}
