import java.util.*;
import java.io.*;
import java.math.*;

class WordSet {

    public String w;

    public WordSet(String s) {
        this.w = s.toLowerCase();
    }

    public String union(WordSet s) {
        TreeSet<String> ts = new TreeSet<>();
        StringTokenizer s1 = new StringTokenizer(this.w);
        while (s1.hasMoreTokens()) {
            ts.add(s1.nextToken());
        }
        StringTokenizer s2 = new StringTokenizer(s.w);
        while (s2.hasMoreTokens()) {
            ts.add(s2.nextToken());
        }
        String ans = "";
        for (String tmp : ts) {
            ans += tmp + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }

    public String intersection(WordSet s) {
        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<String> ts2 = new TreeSet<>();
        StringTokenizer s1 = new StringTokenizer(this.w);
        while (s1.hasMoreTokens()) {
            ts1.add(s1.nextToken());
        }
        StringTokenizer s2 = new StringTokenizer(s.w);
        while (s2.hasMoreTokens()) {
            ts2.add(s2.nextToken());
        }
        String ans = "";
        for (String tmp1 : ts1) {
            if (ts2.contains(tmp1)) {
                ans += tmp1 + " ";
            }
        }
        return ans.substring(0, ans.length() - 1);
    }
}

public class J04022_WordSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
