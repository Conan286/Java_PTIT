//B21DCCN441
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class MonHoc {

    private String idSub, nameSub, examSub;

    public MonHoc(String a, String b, String c) {
        this.idSub = a;
        this.nameSub = b;
        this.examSub = c;
    }

    public String getId() {
        return this.idSub;
    }

    public String getName() {
        return this.nameSub;
    }

    public String getExam() {
        return this.examSub;
    }
}

class CaThi {

    private String id, day, time, room;

    public CaThi(String id, String day, String time, String room) {
        this.id = id;
        this.day = day;
        this.time = time;
        this.room = room;
    }

    public String getId() {
        return this.id;
    }

    public String getDay() {
        return this.day;
    }

    public String getTime() {
        return this.time;
    }

    public String getRoom() {
        return this.room;
    }
}

class LichThi {

    private CaThi c;
    private MonHoc m;
    private String id;
    private int NumOfStudent;

    public LichThi(CaThi ct, MonHoc mh, String id, int num) {
        this.c = ct;
        this.m = mh;
        this.id = id;
        this.NumOfStudent = num;
    }

    public String getDay() {
        return this.c.getDay();
    }

    public String getTime() {
        return this.c.getTime();
    }

    public String getId() {
        return this.c.getId();
    }

    @Override
    public String toString() {
        return this.c.getDay() + " " + this.c.getTime() + " " + this.c.getRoom() + " " + this.m.getName() + " " + this.id + " " + this.NumOfStudent;
    }
}

public class J07060_SapXepLichThi {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        TreeMap<String, MonHoc> tsm = new TreeMap<>();
        TreeMap<String, CaThi> tsc = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            tsm.put(id, new MonHoc(id, name, type));
        }
        sc = new Scanner(new File("CATHI.in"));
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            String id = "C" + i;
            if (i < 10) {
                id = "C00" + i;
            } else if (i < 100) {
                id = "C0" + i;
            }
            tsc.put(id, new CaThi(id, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("LICHTHI.in"));
        int k = sc.nextInt();
        sc.nextLine();
        ArrayList<LichThi> al = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            String s = sc.nextLine();
            String id = s.split(" ")[0];
            String name = s.split(" ")[1];
            String gro = s.split(" ")[2];
            int num = Integer.valueOf(s.split(" ")[3]);
            al.add(new LichThi(tsc.get(id), tsm.get(name), gro, num));
        }
        Collections.sort(al, new Comparator<LichThi>() {
            @Override
            public int compare(LichThi a, LichThi b) {
                int ya = Integer.valueOf(a.getDay().substring(6, 10));
                int yb = Integer.valueOf(b.getDay().substring(6, 10));
                int ma = Integer.valueOf(a.getDay().substring(3, 5));
                int mb = Integer.valueOf(b.getDay().substring(3, 5));
                int da = Integer.valueOf(a.getDay().substring(0, 2));
                int db = Integer.valueOf(b.getDay().substring(0, 2));
                int ha = Integer.valueOf(a.getTime().substring(0, 2));
                int hb = Integer.valueOf(b.getTime().substring(0, 2));
                int mia = Integer.valueOf(a.getTime().substring(3, 5));
                int mib = Integer.valueOf(b.getTime().substring(3, 5));
                if (ya != yb) {
                    return ya - yb;
                }
                if (ma != mb) {
                    return ma - mb;
                }
                if (da != db) {
                    return da - db;
                }
                if (ha != hb) {
                    return ha - hb;
                }
                if (mia != mib) {
                    return mia - mib;
                }
                return a.getId().compareTo(b.getId());
            }
        });
        for (LichThi lt : al) {
            System.out.println(lt);
        }
    }
}
