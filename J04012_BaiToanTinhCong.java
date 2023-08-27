import java.io.*;
import java.math.*;
import java.util.*;

public class J04012_BaiToanTinhCong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int lcb = sc.nextInt();
        int snc = sc.nextInt();
        sc.nextLine();
        String cv = sc.nextLine();
        int l = snc * lcb;
        int t = 0, pc, tn;
        if (snc >= 25) {
            t = l * 20 / 100;
        } else if (snc >= 22) {
            t = l * 10 / 100;
        }
        if (cv.equals("GD")) {
            pc = 250000;
        } else if (cv.equals("PGD")) {
            pc = 200000;
        } else if (cv.equals("TP")) {
            pc = 180000;
        } else {
            pc = 150000;
        }
        tn = l + t + pc;
        System.out.printf("NV01 %s %d %d %d %d", name, l, t, pc, tn);
    }
}
