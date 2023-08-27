import java.io.*;
import java.math.*;
import java.util.*;

public class J04013_BaiToanTuyenSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double t = sc.nextDouble();
        double l = sc.nextDouble();
        double h = sc.nextDouble();
        double tt = t * 2 + l + h;
        String st = "TRUNG TUYEN";
        double dut = 2.5;
        String kv = id.substring(0, 3);
        if (kv.equals("KV1")) {
            dut = 0.5;
        } else if (kv.equals("KV2")) {
            dut = 1.0;
        }

        if ((tt + dut) < 24) {
            st = "TRUOT";
        }
        if (kv.equals("KV2")) {
            System.out.printf("%s %s %.0f ", id, name, dut);
        } else {
            System.out.printf("%s %s %.1f ", id, name, dut);
        }
        if (tt - (int) tt > 0) {
            System.out.printf("%.1f %s", tt, st);
        } else {
            System.out.printf("%.0f %s", tt, st);
        }

    }
}
