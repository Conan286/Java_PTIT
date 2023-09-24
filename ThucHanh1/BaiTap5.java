//B21DCCN441
import java.math.*;
import java.util.*;
import java.io.*;

public class BaiTap5 {

    public static int N = 93;
    public static long[] l = new long[N];

    public static void generation() {
        l[0] = 0;
        l[1] = 1;
        l[2] = 1;
        for (int i = 3; i < N; i++) {
            l[i] = l[i - 1] + l[i - 2];
        }
    }

    public static int CharacterAt(int n, long k) {
        if (k == 1 && n % 2 == 0) {
            return 1;
        }
        if (k == 1 && n % 2 != 0) {
            return 0;
        }
        long len = l[n - 2];
        if (k == len) {
            return 1;
        }
        if (k < len) {
            return CharacterAt(n - 2, k);
        }
        return CharacterAt(n - 1, k - len);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        generation();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(CharacterAt(n, k));
        }
    }
}
