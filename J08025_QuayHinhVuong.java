import java.util.*;
import java.io.*;
import java.math.*;

class PairSI {

    String key;
    int value;

    public PairSI(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class J08025_QuayHinhVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[6];
        int[] b = new int[6];
        while (t-- > 0) {
            for (int i = 0; i < 6; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < 6; i++) {
                b[i] = sc.nextInt();
            }
            String x = "", y = "";
            TreeSet<String> ts = new TreeSet<>();
            for (int i = 0; i < 6; i++) {
                x += String.valueOf(a[i]);
                y += String.valueOf(b[i]);
            }
            Deque<PairSI> dq = new ArrayDeque<>();
            int cnt = 0;
            String k = x;
            dq.push(new PairSI(k, cnt));
            while (true) {
                PairSI top = dq.peekLast();
                dq.pollLast();
                k = top.key;
                cnt = top.value;
                if (k.equals(y)) {
                    break;
                }
                String t1 = "", t2 = "";
                t1 += k.charAt(3);
                t1 += k.charAt(0);
                t1 += k.charAt(2);
                t1 += k.charAt(4);
                t1 += k.charAt(1);
                t1 += k.charAt(5);
                t2 += k.charAt(0);
                t2 += k.charAt(4);
                t2 += k.charAt(1);
                t2 += k.charAt(3);
                t2 += k.charAt(5);
                t2 += k.charAt(2);
                if (!ts.contains(t1)) {
                    ts.add(t1);
                    dq.push(new PairSI(t1, cnt + 1));
                }
                if (!ts.contains(t2)) {
                    ts.add(t2);
                    dq.push(new PairSI(t2, cnt + 1));
                }
            }
            System.out.println(cnt);
        }
    }
}
