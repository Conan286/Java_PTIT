
import java.io.*;
import java.math.*;
import java.util.*;

public class J07076_SapXepMaTran {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int c = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i][c - 1] > a[j][c - 1]) {
                        int tmp = a[i][c - 1];
                        a[i][c - 1] = a[j][c - 1];
                        a[j][c - 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
