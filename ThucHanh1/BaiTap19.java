//B21DCCN441
import java.math.*;
import java.util.*;
import java.io.*;

public class BaiTap19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            Arrays.sort(a);
            if (check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(long a[], int n) {
        for (int i = n - 1; i > 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (a[l] + a[r] == a[i]) {
                    return true;
                } else if (a[l] + a[r] > a[i]) {
                    r--;
                } else if (a[l] + a[r] < a[i]) {
                    l++;
                }
            }
        }
        return false;
    }

}
