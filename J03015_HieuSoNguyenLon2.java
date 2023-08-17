import java.util.*;
import java.io.*;
import java.math.*;
public class J03015_HieuSoNguyenLon2 {
public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.next();
        String b = sc.next();
        int l = a.length()>b.length()?a.length():b.length();
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        String res = aa.subtract(bb).toString();
        System.out.println(res);
        }
}

