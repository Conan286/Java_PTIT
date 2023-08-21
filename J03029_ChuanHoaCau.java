import java.io.*;
import java.math.*;
import java.util.*;

public class J03029_ChuanHoaCau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer ss = new StringTokenizer(s);
            Vector<String> v = new Vector<>();
            while (ss.hasMoreTokens()) {
                v.add(ss.nextToken());
            }
            int n = v.size();
            if (v.elementAt(n - 1).charAt(v.elementAt(n - 1).length() - 1) != '.' && v.elementAt(n - 1).charAt(v.elementAt(n - 1).length() - 1) != '?' && v.elementAt(n - 1).charAt(v.elementAt(n - 1).length() - 1) != '!') {
                String s2 = v.elementAt(n - 1);
                s2 += ".";
                v.removeElementAt(n - 1);
                v.add(s2);
            }
            if (v.elementAt(n - 1).equals(".") || v.elementAt(n - 1).equals("!") || v.elementAt(n - 1).equals("?")) {
                String kitu = v.elementAt(n - 1);
                v.removeElementAt(n - 1);
                n = v.size();
                String s2 = v.elementAt(n - 1);
                s2 += kitu;
                v.removeElementAt(n - 1);
                v.add(s2);
            }
            char x = v.elementAt(0).charAt(0);
            if (x >= 'a' && x <= 'z') {
                x = (char) (x - 32);
            }
            String xx = v.elementAt(0).substring(1);
            xx = x + xx + " ";
            for (int i = 1; i < v.size() - 1; i++) {
                xx += v.elementAt(i) + " ";
            }
            xx += v.elementAt(v.size() - 1);
            System.out.println(xx);
        }
    }
}