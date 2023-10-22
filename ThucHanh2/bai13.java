//B21DCCN441
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

class MonHoc {

    public String mmh, tmh, htt;

    public MonHoc(String a, String b, String c) {
        mmh = a;
        tmh = b;
        htt = c;
    }

    public void display() {
        System.out.printf("%s %s %s\n", mmh, tmh, htt);
    }

    @Override
    public String toString() {
        return mmh + " " + tmh + " " + htt;
    }
}

public class bai13{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc t, MonHoc t1) {
                return t.mmh.compareTo(t1.mmh);
            }

        });
        for (MonHoc pass : a) {
            pass.display();
        }
    }
}