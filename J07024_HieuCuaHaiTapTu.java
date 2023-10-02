//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

class WordSet {

    public TreeSet<String> w = new TreeSet<>();

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            w.add(sc.next().toLowerCase());
        }
    }

    public String difference(WordSet s) {
        String ans = "";
        for (String a : this.w) {
            if (!s.w.contains(a)) {
                ans += a + " ";
            }
        }
        return ans.substring(0, ans.length() - 1);
    }
}

public class J07024_HieuCuaHaiTapTu {

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
