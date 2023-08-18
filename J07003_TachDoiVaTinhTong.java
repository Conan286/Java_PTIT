import java.io.*;
import java.util.*;
import java.math.*;

public class J07003_TachDoiVaTinhTong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while (s.length() > 1) {
            int n = s.length();
            String s1 = s.substring(0, n / 2);
            String s2 = s.substring(n / 2, n);

            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            BigInteger sum = n1.add(n2);
            s = sum.toString();
            System.out.println(sum);
        }
    }
}
