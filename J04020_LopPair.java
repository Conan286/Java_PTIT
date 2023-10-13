
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class Pair<KEY, VALUE> {

    public KEY k;
    public VALUE v;

    public Pair(KEY k, VALUE v) {
        this.k = k;
        this.v = v;
    }

    public boolean prime(int n) {
        int k = (int) Math.sqrt(n);
        for (int i = 2; i <= k; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return (n > 1) ? true : false;
    }

    public boolean isPrime() {
        if (prime((Integer) this.k) && prime((Integer) this.v)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "" + this.k + " " + this.v;
    }
}

public class J04020_LopPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
