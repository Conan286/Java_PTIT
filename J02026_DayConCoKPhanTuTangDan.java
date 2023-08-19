
import java.math.*;
import java.io.*;
import java.util.*;

public class J02026_DayConCoKPhanTuTangDan {

    public static int n, k;
    public static int ok = 1;
    public static int[] a = new int[100];
    public static int[] b = new int[100];

    public static void st() {
        for (int i = 0; i <= k; i++) {
            a[i] = i;
        }
    }

    public static void generate() {
        int i = k;
        while (i > 0 && a[i] == n - k + i) {
            i--;
        }
        if (i == 0) {
            ok = 0;
        } else {
            a[i]++;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
    }

    public static void print() {
        for (int i = 1; i <= k; i++) {
            System.out.print(b[a[i]] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ok = 1;
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(b, 1, n + 1);
            st();
            while (ok > 0) {
                print();
                generate();
            }
        }
    }
}
