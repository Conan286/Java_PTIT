import java.io.*;
import java.util.*;
import java.math.*;
public class bai3 {

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
        int l = 0,r=n.length()-1;
        char []c = n.toCharArray();
        while(l<r)
        {
        if(c[l]!=c[r]) return false;
        if(c[l]!='2'&&c[l]!='3'&&c[l]!='5'&&c[l]!='7') return false;
        l++;
        r--;
        }
        return true;
    }
}
