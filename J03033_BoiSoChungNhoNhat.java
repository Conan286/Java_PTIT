import java.util.*;
import java.io.*;
import java.math.*;
public class J03033_BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger a1 = new BigInteger(s1);
        BigInteger a2 = new BigInteger(s2);
        BigInteger a3 = a1.gcd(a2);
        BigInteger a4 = a1.multiply(a2);
        System.out.println(a4.divide(a3));
        }
        
    }
}
