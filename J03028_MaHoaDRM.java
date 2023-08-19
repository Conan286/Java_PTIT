import java.io.*;
import java.math.*;
import java.util.*;


public class J03028_MaHoaDRM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(ptit(s));
        }
    }

    
    public static String ptit(String s) {
        int n = s.length();
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        a = rotateString(a, rotate(a));
        b = rotateString(b, rotate(b));
        return Merge(a, b);
    }

    
    public static String Merge(String a, String b) {
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        int n = a.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            int k = c[i] - 65;
            int r = d[i] - 65;
            k += r;
            k %= 26;
            ans += (char) (k + 65);
        }
        return ans;
    }

    
    public static String rotateString(String a, int r) {
        char[] c = a.toCharArray();
        String ans = "";
        for (Character i : c) {
            int x = i - 65;
            x += r;
            x = x % 26;
            char k = (char) (x + 65);
            ans += k;
        }
        return ans;
    }

    
    public static int rotate(String a) {
        char[] c = a.toCharArray();
        int sum = 0;
        for (Character i : c) {
            sum += i - 65;
        }
        return sum;
    }
}