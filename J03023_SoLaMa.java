import java.util.*;
import java.math.*;
import java.io.*;

public class J03023_SoLaMa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            char[] c = s.toCharArray();
            int sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                sum += slm(c[i]);
                int j = i - 1, flag = 0;
                while (j >= 0 && slm(c[i]) > slm(c[j])) {
                    sum -= slm(c[j]);
                    j--;
                    flag = 1;
                }
                if (flag > 0) {
                    i = j + 1;
                }
            }
            System.out.println(sum);
        }
    }

    public static int slm(char c) {
        return ((c == 'I') ? 1 : ((c == 'V') ? 5 : ((c == 'X') ? 10 : ((c == 'L') ? 50 : ((c == 'C') ? 100 : ((c == 'D') ? 500 : (1000)))))));
    }
}