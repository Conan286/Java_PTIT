import java.util.*;
import java.io.*;
import java.math.*;
public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String a = sc.next();
        String b = sc.next();
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        System.out.println(aa.gcd(bb));
        }
    }
}
