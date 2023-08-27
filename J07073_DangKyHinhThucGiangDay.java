import java.io.*;
import java.math.*;
import java.util.*;

class MonHoc {
    public String mmh, tmh, lt, th, stc;
    public MonHoc(String mmh, String tmh, String stc, String lt, String th) {
        this.mmh = mmh;
        this.tmh = tmh;
        this.stc = stc;
        this.lt = lt;
        this.th = th;
    }

    public boolean thuchanhtructuyen() {
        return !this.th.equals("Truc tiep");
    }

    @Override
    public String toString() {
        return mmh + " " + tmh + " " + stc + " " + lt + " " + th;
    }
}

public class J07073_DangKyHinhThucGiangDay {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc t, MonHoc t1) {
                return t.mmh.compareTo(t1.mmh);
            }
        });
        for (MonHoc mh : a) {
            if (mh.thuchanhtructuyen()) {
                System.out.println(mh);
            }
        }
    }
}