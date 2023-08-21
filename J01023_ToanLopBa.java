import java.util.*;
import java.io.*;
import java.math.*;

public class J01023_ToanLopBa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] cs = s.toCharArray();
            char x = cs[3];
            if (x == '*' || x == '/') {
                System.out.println("WRONG PROBLEM!");
            } else {
                System.out.println(ptit(s, x));
            }
        }
    }

    public static boolean check(String a, String b) {
        int n = a.length();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == '?') {
                continue;
            } else if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String ptit(String a, char x) {
        for (int i = 10; i <= 99; i++) {
            for (int j = 10; j <= 99; j++) {
                int add = i + j, subtract = i - j;
                if (add >= 10 && add <= 99) {
                    String s = String.valueOf(i) + " + " + String.valueOf(j) + " = " + String.valueOf(i + j);
                    if (check(a, s)) {
                        return s;
                    }
                }
                if (subtract >= 10 && subtract <= 99) {
                    String s = String.valueOf(i) + " - " + String.valueOf(j) + " = " + String.valueOf(i - j);
                    if (check(a, s)) {
                        return s;
                    }
                }
            }
        }
        return "WRONG PROBLEM!";
    }
}
