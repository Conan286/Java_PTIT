//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

class IntSet {

    public TreeSet<Integer> ts = new TreeSet<>();

    public IntSet(int a[]) {
        for (int i = 0; i < a.length; i++) {
            ts.add(a[i]);
        }
    }

    public IntSet intersection(IntSet b) {
        int[] arr = new int[this.ts.size()];
        int cnt = 0;
        for (int i : this.ts) {
            if (b.ts.contains(i)) {
                arr[cnt++] = i;
            }
        }
        int[] ans = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            ans[i] = arr[i];
        }
        return new IntSet(ans);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i : this.ts) {
            res += "" + i + " ";
        }
        return res.substring(0, res.length() - 1);
    }

}

public class J07009_LopIntSet2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
