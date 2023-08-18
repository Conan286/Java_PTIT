
import java.io.*;
import java.math.*;
import java.util.*;

public class J07022_LoaiBoSoNguyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> ts = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int k = Integer.valueOf(s);
            } catch (NumberFormatException e) {
                ts.add(s);
            }
        }
        Collections.sort(ts);
        for (String ptit : ts) {
            System.out.print(ptit + " ");
        }
    }
}
