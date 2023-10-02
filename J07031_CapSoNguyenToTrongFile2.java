//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

public class J07031_CapSoNguyenToTrongFile2 {

    public static int N = 1000000;
    public static int[] p = new int[N + 1];

    public static void Sang() {
        for (int i = 0; i <= N; i++) {
            p[i] = 1;
        }
        p[0] = p[1] = 0;
        int k = (int) Math.sqrt(N + 1);
        for (int i = 2; i <= k; i++) {
            if (p[i] == 1) {
                for (int j = i * i; j <= N; j += i) {
                    p[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Sang();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        for (int k : a1) {
            ts1.add(k);
        }
        for (int k : a2) {
            ts2.add(k);
        }
        Collections.sort(a1);
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int n : a1) {
            int m = N - n;
            if (!ts2.contains(n) && !ts2.contains(m) && !tm.containsKey(n) && p[n] == 1 && p[m] == 1 && n < m && ts1.contains(m)) {
                tm.put(n, m);
                System.out.println(n + " " + m);
            }
        }
    }
}
