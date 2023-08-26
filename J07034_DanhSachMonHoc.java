//B21DCCN441 
import java.io.*;
import java.math.*;
import java.util.*;

class MonHoc {

    public String tm, mm;
    public int stc;

    public MonHoc(String a, String b, int c) {
        this.mm = a;
        this.tm = b;
        this.stc = c;
    }

    public void display() {
        System.out.println(mm + " " + tm + " " + stc);
    }
}

public class J07034_DanhSachMonHoc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList<MonHoc> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc t, MonHoc t1) {
                return t.tm.compareTo(t1.tm);
            }
        });
        for (MonHoc p : a) {
            p.display();
        }
    }
}
