//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;

public class J02027_KhoangCachNhoHonK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long cnt = 0;
            int l = 0;
            int r = 1;
            while (r < n) {
                if (a[r] - a[l] < k) {
                    cnt += (r - l);
                    r += 1;
                } else {
                    l += 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
