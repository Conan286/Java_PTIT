//B21DCCN441
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class lopHocPhan {

    public String idSub, nameSub, idGroup, nameTeacher;

    public lopHocPhan(String maMon, String tenMon, String maNhom, String giangVien) {
        this.idSub = maMon;
        this.nameSub = tenMon;
        this.idGroup = maNhom;
        this.nameTeacher = giangVien;
    }

    @Override
    public String toString() {
        return this.idSub + " " + this.nameSub + " " + this.idGroup;
    }
}

public class J05080_LopHocPhan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<lopHocPhan> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            a.add(new lopHocPhan(maMon, tenMon, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<lopHocPhan>() {
            @Override
            public int compare(lopHocPhan t, lopHocPhan t1) {
                if (t.idSub.equals(t1.idSub)) {
                    return t.idGroup.compareTo(t1.idGroup);
                }
                return t.idSub.compareTo(t1.idSub);
            }
        });
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String search = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + search + ":");
            for (lopHocPhan p : a) {
                if (p.nameTeacher.equals(search)) {
                    System.out.println(p);
                }
            }
        }
    }
}
