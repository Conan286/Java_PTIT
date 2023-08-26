import java.util.*;
import java.io.*;
import java.math.*;

class hanhKhach implements Comparable<hanhKhach> {

    public int t, d;

    public hanhKhach(int a, int b) {
        this.t = a;
        this.d = b;
    }

    @Override
    public int compareTo(hanhKhach t1) {
        if (this.t != t1.t) {
            return this.t > t1.t ? 1 : -1;
        }
        return this.d > t1.d ? 1 : -1;
    }
}

public class J02009_XepHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<hanhKhach> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new hanhKhach(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        int t = 0;
        for (int i = 0; i < a.size(); i++) {
            t = Math.max(t, a.get(i).t);
            t += a.get(i).d;
        }
        System.out.println(t);
    }
}
