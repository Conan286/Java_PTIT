//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;

public class BaiTap9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringTokenizer ss = new StringTokenizer(s);
            while (ss.hasMoreTokens()) {
                String tk = ss.nextToken();
                System.out.print(rev(tk) + " ");
            }
            System.out.println("");
        }
    }

    public static String rev(String s) {
        String ans = "";
        for (char i : s.toCharArray()) {
            ans = i + ans;
        }
        return ans;
    }
}
