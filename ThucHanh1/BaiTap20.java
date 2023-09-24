//B21DCCN441
import java.math.*;
import java.util.*;
import java.io.*;

public class BaiTap20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        System.out.println(checkIn(t, d, n));
    }

    public static int checkIn(int t[], int d[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (t[i] > t[j]) {
                    int tmp = t[j];
                    t[j] = t[i];
                    t[i] = tmp;
                    tmp = d[j];
                    d[j] = d[i];
                    d[i] = tmp;
                }
            }
        }
        int T = 0;
        for (int i = 0; i < n; i++) {
            T = Math.max(T, t[i]) + d[i];
        }
        return T;
    }
}
