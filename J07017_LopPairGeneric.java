import java.util.*;
import java.io.*;
import java.math.*;

class Pair<K, V> {

    public K k;
    public V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public boolean prime(int n) {
        int h = (int) Math.sqrt(n);
        for (int i = 2; i <= h; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public boolean isPrime() {
        return prime((Integer) k) && prime((Integer) v);
    }

    @Override
    public String toString() {
        String ans = String.valueOf(k) + " " + String.valueOf(v);
        return ans;
    }
}

public class J07017_LopPairGeneric {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }
}
