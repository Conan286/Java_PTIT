import java.util.*;
import java.io.*;
import java.math.*;

public class BaiTap7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int cnt = 0;
        int[][] a = new int[h + 1][3];
        for (int i = 1; i <= h; i++) {
            int c = 0;
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) {
                    ++c;
                }
            }
            if (c > 1) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
