//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

public class J07015_SoNguyenToTrongFileNhiPhan {

    public static int prime(int n) {
        int k = (int) Math.sqrt(n);
        for (int i = 2; i <= k; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return n > 1 ? 1 : 0;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int v : a) {
            if (prime(v) == 1) {
                if (tm.containsKey(v)) {
                    tm.put(v, tm.get(v) + 1);
                } else {
                    tm.put(v, 1);
                }
            }
        }

        for (int k : tm.keySet()) {
            System.out.println(k + " " + tm.get(k));
        }
    }
}
