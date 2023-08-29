import java.util.*;
import java.io.*;
import java.math.*;

class ThiSinh {

    public String name, birth;
    public int id;
    public double m1, m2, m3, total;

    public ThiSinh(int id, String name, String birth, double m1, double m2, double m3) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.total = m1 + m2 + m3;
    }

    public double getTotal() {
        return this.total;
    }

    public void display() {
        System.out.printf("%d %s %s %.1f\n", id, name, birth, total);
    }
}

public class J05009_TimThuKhoaCuaKyThi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh t1, ThiSinh t2) {
                if (t1.total != t2.total) {
                    return t1.total > t2.total ? 1 : -1;
                }
                return t1.id > t2.id ? 1 : -1;
            }
        });
        for (ThiSinh deptrai : a) {
            if (deptrai.getTotal() == a.get(a.size() - 1).getTotal()) {
                deptrai.display();
            }
        }
    }
}
