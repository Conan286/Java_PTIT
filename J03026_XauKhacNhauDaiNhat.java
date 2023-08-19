import java.io.*;
import java.util.*;
import java.math.*;
public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
         String s1 = sc.next();
         String s2 = sc.next();
         System.out.println(ptit(s1,s2));
        }
}
    public static int ptit(String s1,String s2)
    {
    if(s1.equals(s2)) return -1;
    return s1.length()>s2.length()?s1.length():s2.length();
    }
}
