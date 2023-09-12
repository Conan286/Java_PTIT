//B21DCCN441

import java.io.*;
import java.util.*;
import java.math.*;

class IntSet {

    public int[] a;
    public int n;

    public IntSet(int[] arr) {
        this.n = arr.length;
        this.a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = arr[i];
        }
    }

    public IntSet union(IntSet b) {
        TreeSet<Integer> t = new TreeSet<>();
        for (int i = 0; i < this.n; i++) {
            t.add(this.a[i]);
        }
        for (int i = 0; i < b.n; i++) {
            t.add(b.a[i]);
        }
        int[] ans = new int[t.size()];
        int cnt = 0;
        for (Integer tmp : t) {
            ans[cnt++] = tmp;
        }
        return new IntSet(ans);
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            ans += a[i] + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }
}

public class J04021_LopIntSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
