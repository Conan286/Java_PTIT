import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

class Cathi {

    public String mct, nt, gt, pt;
    public int hour, minute, day, month, year;

    public Cathi(int i, String a, String b, String c) {
        if (i < 10) {
            mct = "C00" + String.valueOf(i);
        } else if (i < 100) {
            mct = "C0" + String.valueOf(i);
        } else {
            mct = "C" + String.valueOf(i);
        }
        nt = a;
        gt = b;
        pt = c;
        day = Integer.valueOf(a.substring(0, 2));
        month = Integer.valueOf(a.substring(3, 5));
        year = Integer.valueOf(a.substring(6, 10));
        hour = Integer.valueOf(b.substring(0, 2));
        minute = Integer.valueOf(b.substring(3, 5));
    }

    @Override
    public String toString() {
        return mct + " " + nt + " " + gt + " " + pt;
    }
}

public class J07059_DanhSachCaThi {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Cathi> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Cathi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<Cathi>() {
            @Override
            public int compare(Cathi a, Cathi b) {
                if (a.year != b.year) {
                    return a.year - b.year;
                } else if (a.month != b.month) {
                    return a.month - b.month;
                } else if (a.day != b.day) {
                    return a.day - b.day;
                } else if (a.hour != b.hour) {
                    return a.hour - b.hour;
                } else if (a.minute != b.minute) {
                    return a.minute - b.minute;
                } else {
                    return a.mct.compareTo(b.mct);
                }
            }
        });
        for (Cathi ct : a) {
            System.out.println(ct);
        }
    }
}
