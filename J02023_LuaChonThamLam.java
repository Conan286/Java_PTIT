
import java.io.*;
import java.util.*;
import java.math.*;

public class J02023_LuaChonThamLam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        luachonthamlam(n, s);
    }

    public static void luachonthamlam(int n, int s) {

        if (s > 9 * n || (n > 1 && s == 0)) {
            System.out.println("-1 -1");
        } else if (n == 1) {
            System.out.println(s + " " + s);
        } else {
            String s1 = "";
            String s2 = "";
            int r = s / 9;
            int t = s % 9;
            for (int i = 1; i <= r; i++) {
                s1 += "9";
            }
            if (s1.length() < n) {
                s1 += String.valueOf(t);
            }
            while (s1.length() < n) {
                s1 += "0";
            }
            if (s <= 9) {
                s2 += "1";
                while (s2.length() < n - 1) {
                    s2 = "0" + s2;
                }
                s2 = String.valueOf(s - 1) + s2;
                StringBuilder c = new StringBuilder(s2);
                s2 = c.reverse().toString();
            } else {
                int l = 0;
                while (s > 9) {
                    s2 += "9";
                    s -= 9;
                    l++;
                }
                int z = n - l;
                if (z == 1) {
                    s2 = String.valueOf(s) + s2;
                } else if (z > 1) {
                    if (s == 1) {
                        while (s2.length() < n - 1) {
                            s2 = "0" + s2;
                        }
                        s2 = "1" + s2;
                    } else {
                        s2 = String.valueOf(s - 1) + s2;
                        while (s2.length() < n - 1) {
                            s2 = "0" + s2;
                        }
                        s2 = "1" + s2;
                    }
                }
            }
            System.out.println(s2 + " " + s1);
        }
    }
}
