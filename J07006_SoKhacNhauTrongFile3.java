//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;

public class J07006_SoKhacNhauTrongFile3 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int v : a) {
            if (tm.containsKey(v)) {
                tm.put(v, tm.get(v) + 1);
            } else {
                tm.put(v, 1);
            }
        }
        for (int k : tm.keySet()) {
            System.out.println(k + " " + tm.get(k));
        }
    }
}
