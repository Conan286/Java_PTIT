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

    public String union(WordSet s2) {
        String ans = "";
        TreeSet<String> ts = new TreeSet<>();
        for (String a : this.w) {
            ts.add(a);
        }
        for (String a : s2.w) {
            ts.add(a);
        }
        for (String a : ts) {
            ans += a + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }

    public String intersection(WordSet s2) {
        String ans = "";
        for (String a : this.w) {
            if (s2.w.contains(a)) {
                ans += a + " ";
            }
        }
        return ans.substring(0, ans.length() - 1);
    }
}

public class J07014_HopVaGiaoCuaHaiFileVanBan {

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
