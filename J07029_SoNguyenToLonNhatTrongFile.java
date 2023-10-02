//B21DCCN441
import java.math.*;
import java.io.*;
import java.util.*;

public class J07029_SoNguyenToLonNhatTrongFile {

    public static int N = 1000001;
    public static int[] p = new int[N];

    public static void Sang() {
        for (int i = 0; i < N; i++) {
            p[i] = 1;
        }
        p[0] = p[1] = 0;
        int k = (int) Math.sqrt(N);
        for (int i = 2; i <= k; i++) {
            if (p[i] == 1) {
                for (int j = i * i; j < N; j += i) {
                    p[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Sang();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        ArrayList<Integer> t = new ArrayList();
        for (int key : a) {
            if (p[key] == 1) {

                if (tm.containsKey(key)) {
                    tm.put(key, tm.get(key) + 1);
                } else {
                    t.add(key);
                    tm.put(key, 1);
                }
            }
        }
        Collections.sort(t);
        int n = t.size();
        for (int i = n - 1; i > n - 11; i--) {
            System.out.println(t.get(i) + " " + tm.get(t.get(i)));
        }
    }
}
