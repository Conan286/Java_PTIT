
import java.util.*;
import java.io.*;

public class J03005_ChuanHoaXauHoTen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer ss = new StringTokenizer(s);
            Vector<String> v = new Vector<>();
            Vector<String> v1 = new Vector<>();
            while (ss.hasMoreTokens()) {
                v.add(ss.nextToken());
            }
            String res = "";
            for (int i = 1; i < v.size(); i++) {
                String mp = v.elementAt(i);
                char x = (char) (v.elementAt(i).charAt(0) - 32);
                mp = x + mp.substring(1);
                if (i < v.size() - 1) {
                    res += mp + " ";
                } else {
                    res += mp + ", ";
                }
            }
            res += v.elementAt(0).toUpperCase();
            System.out.println(res);
        }
    }
}
