
import java.io.*;
import java.util.*;
import java.math.*;

public class J03022_XuLyVanBan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            s += sc.nextLine().toLowerCase();
        }
        s = s.replace('?', '.');
        s = s.replace('!', '.');
        String[] token = s.split("[.]");
        for (String tk : token) {
            StringTokenizer ss = new StringTokenizer(tk);
            String res = "";
            while (ss.hasMoreTokens()) {
                String tmp = ss.nextToken();
                res += tmp + " ";
            }
            char t = (char) (res.charAt(0) - 32);
            res = t + res.substring(1, res.length() - 1);
            System.out.println(res);
        }
    }
}
