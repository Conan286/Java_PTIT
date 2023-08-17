import java.util.*;
import java.io.*;
import java.math.*;
public class J03039_ChiaHet {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String a = sc.next();
        String b = sc.next();
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger m = aa.mod(bb);
        BigInteger n = bb.mod(aa);
        BigInteger c = new BigInteger("0");
        if(m.compareTo(c)==0||n.compareTo(c)==0)
         System.out.println("YES");
        else System.out.println("NO");
        }
    }
}
