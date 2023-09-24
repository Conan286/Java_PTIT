import java.util.*;
import java.io.*;
import java.math.*;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); int y1 = sc.nextInt();
        int x2 = sc.nextInt(); int y2 = sc.nextInt();
        int x3 = sc.nextInt(); int y3 = sc.nextInt();
        int x4 = sc.nextInt(); int y4 = sc.nextInt();
        int minx = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int maxx = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int miny = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int maxy = Math.max(Math.max(y1, y2), Math.max(y3, y4));
        int l = Math.max(maxx-minx, maxy-miny);
        System.out.println(l*l);
    }
}
