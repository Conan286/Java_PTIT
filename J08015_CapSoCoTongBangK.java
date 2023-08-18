import java.util.*;
import java.io.*;
import java.math.*;

public class J08015_CapSoCoTongBangK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            long ans = 0;
            TreeMap<Long, Integer> tm = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (tm.containsKey(a[i])) {
                    tm.put(a[i], tm.get(a[i]) + 1);
                } else {
                    tm.put(a[i], 1);
                }
            }
            for (int i = 0; i < n; i++) {
                long h = k - a[i];
                if (tm.containsKey(h)) {
                    ans += tm.get(h);
                    if (a[i] + a[i] == k) {
                        --ans;
                    }
                }
            }
            System.out.println(ans / 2);
        }
    }
}