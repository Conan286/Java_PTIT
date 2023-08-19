import java.io.*;
import java.math.*;
import java.util.*;

public class J08027_GoBanPhim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(ptit(s));
    }

    public static String ptit(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        Stack<Character> sc = new Stack<>();
        for (int j = 0; j < n; j++) {
            char i = s.charAt(j);
            if (i == '<') {
                if (!sc.empty()) {
                    st.push(sc.pop());
                }
            } else if (i == '>') {
                if (!st.empty()) {
                    sc.push(st.pop());
                }
            } else if (i == '-') {
                if (!sc.empty()) {
                    sc.pop();
                }
            } else {
                sc.push(i);
            }
        }
        StringBuilder sb = new StringBuilder("");
        while (!sc.empty()) {
            st.push(sc.pop());
        }
        for (int i = st.size() - 1; i >= 0; i--) {
            sb.insert(sb.length(), st.elementAt(i));
        }
        return sb.toString();
    }
}