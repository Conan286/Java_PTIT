import java.util.*;
import java.io.*;
import java.math.*;
public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String a = sc.next();
        String b = sc.next();
        int l = a.length()>b.length()?a.length():b.length();
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        String res = aa.subtract(bb).toString();
        if(res.charAt(0)=='-') res=res.substring(1);
        while(res.length()<l) res="0"+res;
        System.out.println(res);
        }
    }
}
