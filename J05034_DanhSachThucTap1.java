import java.util.*;
import java.lang.*;
import java.math.*;

class SinhVien {

    private int stt;
    private String id, name, lop, mail, dn;

    public SinhVien(int i, String msv, String ht, String l, String email, String dn) {
        this.stt = i;
        this.id = msv;
        this.name = ht;
        this.mail = email;
        this.lop = l;
        this.dn = dn;
    }

    public String getDn() {
        return this.dn;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.valueOf(stt) + " " + this.id + " " + this.name + " " + this.lop + " " + this.mail + " " + this.dn;
    }
}

public class J05034_DanhSachThucTap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sv.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                return t.getName().compareTo(t1.getName());
            }
        });
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String search = sc.nextLine();
            for (SinhVien p : sv) {
                if (p.getDn().equals(search)) {
                    System.out.println(p);
                }
            }
        }
    }
}
