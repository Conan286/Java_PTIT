import java.util.*;
import java.io.*;
import java.math.*;

class SV {

    public String name;
    public int c, t;

    public SV(String name, int c, int t) {
        this.name = name;
        this.c = c;
        this.t = t;
    }

    @Override
    public String toString() {
        return name + " " + c + " " + t;
    }
}

public class J05042_BangXepHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SV> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new SV(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<SV>() {
            @Override
            public int compare(SV t1, SV t2) {
                if (t1.c != t2.c) {
                    return t1.c < t2.c ? 1 : -1;
                } else if (t1.t != t2.t) {
                    return t1.t < t2.t ? -1 : 1;
                }
                return t1.name.compareTo(t2.name);
            }
        });

        for (SV sv : a) {
            System.out.println(sv);
        }
    }
}
