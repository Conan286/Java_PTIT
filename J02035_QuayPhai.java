import java.util.*;
import java.io.*;
import java.math.*;

public class J02035_QuayPhai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int id = n - 2;
            while (id >= 0 && a[id] <= a[id + 1]) {
                id--;
            }
            System.out.println(id + 1);
        }
    }
}
