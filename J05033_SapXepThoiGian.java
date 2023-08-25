//B21DCCN441 codeptraikhong =))
import java.io.*;
import java.util.*;
import java.math.*;

class ThoiGian {

    public int a, b, c;

    public ThoiGian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void print() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class J05033_SapXepThoiGian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThoiGian> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<ThoiGian>() {
            @Override
            public int compare(ThoiGian t, ThoiGian t1) {
                if (t.a != t1.a) {
                    return t.a > t1.a ? 1 : -1;
                } else if (t.b != t1.b) {
                    return t.b > t1.b ? 1 : -1;
                }
                return t.c > t1.c ? 1 : -1;
            }
        });
        for (ThoiGian t : a) {
            t.print();
        }
    }
}
