import java.io.*;
import java.util.*;
import java.math.*;
public class J03018_TimSoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String n = sc.next();
        
//        note:
//        1^n + 2^n + 3^n + 4^n mod 5
//        = 4 if n mod 4 == 0
//        = 0 if n mod 4 != 0

        BigInteger s = new BigInteger(n);
        BigInteger m = new BigInteger("0");
        BigInteger k = new BigInteger("4");
        BigInteger mod = s.mod(k);
        if(mod.equals(m)) System.out.println("4");
        else System.out.println("0");
        }
    }
}
