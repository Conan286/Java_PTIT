import java.util.*;
import java.io.*;
import java.math.*;
public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String a1 = sc.next();
        
        BigInteger a = new BigInteger(a1);
        BigInteger b = new BigInteger("11");
        BigInteger c = new BigInteger("0");
        if(a.mod(b).equals(c)) System.out.println(1);
        else System.out.println(0);
        }
    }
}
