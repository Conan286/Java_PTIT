import java.util.*;
import java.io.*;
import java.math.*;
public class J03012_TongSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String a1 = sc.next();
        String b1 = sc.next();
        BigInteger a = new BigInteger(a1);
        BigInteger b = new BigInteger(b1);
            System.out.println(a.add(b));
        }
    }
}
