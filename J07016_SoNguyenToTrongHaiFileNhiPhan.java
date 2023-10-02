//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

public class J07016_SoNguyenToTrongHaiFileNhiPhan {

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
        TreeSet<Integer> ts = new TreeSet<>();
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        for (int k : a1) {
            ts.add(k);
            if (tm1.containsKey(k)) {
                tm1.put(k, tm1.get(k) + 1);
            } else {
                tm1.put(k, 1);
            }
        }
        for (int k : a2) {
            ts.add(k);
            if (tm2.containsKey(k)) {
                tm2.put(k, tm2.get(k) + 1);
            } else {
                tm2.put(k, 1);
            }
        }
        for (int k : ts) {
            if (p[k] == 1 && tm1.containsKey(k) && tm2.containsKey(k)) {
                System.out.println(k + " " + tm1.get(k) + " " + tm2.get(k));
            }
        }
    }
}
