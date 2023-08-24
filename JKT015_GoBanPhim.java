import java.util.*;
import java.io.*;
import java.math.*;

public class JKT015_GoBanPhim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        gobanphim(s);
    }

    public static void gobanphim(String s) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        char[] c = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (c[i] == '<') {
                if (!s1.empty()) {
                    s2.push(s1.pop());
                }
            } else if (c[i] == '>') {
                if (!s2.empty()) {
                    s1.push(s2.pop());
                }
            } else if (c[i] == '-') {
                if (!s1.empty()) {
                    s1.pop();
                }
            } else {
                s1.push(c[i]);
            }
        }
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        for (int i = 0; i < s1.size(); i++) {
            System.out.print(s1.elementAt(i));
        }
    }
}
