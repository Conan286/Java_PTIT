//B21DCCN441 kute
import java.io.*;
import java.util.*;
import java.math.*;

class GiaoVien {

    private String id;
    private String name;
    private long lcb, l, pc;
    private int hsl;

    public GiaoVien(String id, String name, long lcb) {
        this.id = id;
        this.name = name;
        this.lcb = lcb;
        String cb = id.substring(0, 2);
        if (cb.equals("HP")) {
            pc = 900000;
        } else if (cb.equals("HT")) {
            pc = 2000000;
        } else {
            pc = 500000;
        }
        hsl = Integer.valueOf(id.substring(2));
        l = this.lcb * hsl + pc;
    }

    public void print() {
        System.out.printf("%s %s %d %d %d\n", id, name, hsl, pc, l);
    }
}

public class J04015_TinhThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien deptrai = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        deptrai.print();
    }
}
