import java.io.*;
import java.math.*;
import java.util.*;

class SV {

    public String first, middle, last, id, name, sdt, email;

    public SV(String id, String a, String sdt, String email) {
        ArrayList<String> ar = new ArrayList<>();
        StringTokenizer ss = new StringTokenizer(a);
        while (ss.hasMoreTokens()) {
            ar.add(ss.nextToken());
        }
        first = ar.get(0);
        last = ar.get(ar.size() - 1);
        middle = "";
        for (int i = 1; i < ar.size() - 1; i++) {
            middle += ar.get(i) + " ";
        }
        middle = middle.substring(0, middle.length() - 1);
        this.id = id;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + first + " " + middle + " " + last + " " + sdt + " " + email;
    }
}

public class J07081_SapXepDanhSachSinhVien {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SV> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<SV>() {
            @Override
            public int compare(SV a, SV b) {
                if (!a.last.equals(b.last)) {
                    return a.last.compareTo(b.last);
                } else if (!a.first.equals(b.first)) {
                    return a.first.compareTo(b.first);
                } else if (!a.middle.equals(b.middle)) {
                    return a.middle.compareTo(b.middle);
                }
                return a.id.compareTo(b.id);
            }
        });
        for (SV sv : a) {
            System.out.println(sv);
        }
    }
}
