import java.util.*;
import java.io.*;
import java.math.*;

public class J08010_TimTuThuanNghichDaiNhat {

    public static boolean check(String s) {
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;
        while (l < r) {
            if (c[l++] != c[r--]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> tm = new TreeMap<>();
        LinkedHashSet<String> ts = new LinkedHashSet<>();
        ArrayList<String> a = new ArrayList<>();
        int max = 0;
        while (sc.hasNext()) {
            String k = sc.next();
            if (check(k)) {
                max = max > k.length() ? max : k.length();
                if (tm.containsKey(k)) {
                    tm.put(k, tm.get(k) + 1);
                } else {
                    tm.put(k, 1);
                }
                ts.add(k);
            }
        }

        for (String x : ts) {
            if (x.length() == max) {
                a.add(x);
            }
        }
        for (String x : a) {
            System.out.println(x + " " + tm.get(x));
        }
    }
}
