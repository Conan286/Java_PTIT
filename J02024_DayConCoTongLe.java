import java.util.*;
import java.io.*;
import java.math.*;

public class J02024_DayConCoTongLe {

    public static int n;
    public static int ok = 1;
    public static int[] a = new int[100];
    public static int[] b = new int[100];

    public static void st() {
        for (int i = 0; i <= n; i++) {
            a[i] = 0;
        }
    }

    public static void generate() {
        int i = n;
        while (i > 0 && a[i] == 1) {
            a[i--] = 0;
        }
        if (i == 0) {
            ok = 0;
        } else {
            a[i] = 1;
        }
    }

    public static void print() {
        for (int i = 1; i <= n; i++) {
            if (a[i] == 1) {
                System.out.print(b[i] + " ");
            }
        }
        System.out.println("");

    }

    public static boolean check() {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] == 1) {
                s += b[i];
            }
        }
        return s % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ok = 1;
            n = sc.nextInt();
            st();
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(b, 1, n + 1);
            int l = 1, r = n;
            while (l < r) {
                int tmp = b[r];
                b[r--] = b[l];
                b[l++] = tmp;
            }
            while (ok > 0) {
                if (check()) {
                    print();
                }
                generate();
            }
        }
    }
}
