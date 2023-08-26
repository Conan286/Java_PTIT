
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

class Name {

    public String first, middle, last, tvt;

    public Name(String a) {
        ArrayList<String> ar = new ArrayList<>();
        StringTokenizer ss = new StringTokenizer(a);
        while (ss.hasMoreTokens()) {
            ar.add(ss.nextToken());
        }
        first = ar.get(0);
        tvt = "";
        tvt += first.charAt(0) + ".";
        last = ar.get(ar.size() - 1);
        middle = "";
        for (int i = 1; i < ar.size() - 1; i++) {
            middle += ar.get(i) + " ";
            tvt += ar.get(i).charAt(0) + ".";
        }
        middle = middle.substring(0, middle.length() - 1);
        tvt += last.charAt(0);
    }

    public boolean check(String s) {
        if (this.tvt.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) == '*') {
                continue;
            } else if (s.charAt(i) != tvt.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return first + " " + middle + " " + last;
    }
}

public class J07071_TenVietTat {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            StringTokenizer ss = new StringTokenizer(s.toLowerCase());
            String ans = "";
            while (ss.hasMoreTokens()) {
                String z = ss.nextToken();
                char x = (char) (z.charAt(0) - 32);
                ans += x + z.substring(1) + " ";
            }
            a.add(new Name(ans.substring(0, ans.length() - 1)));
        }
        Collections.sort(a, new Comparator<Name>() {
            @Override
            public int compare(Name a, Name b) {
                if (!a.last.equals(b.last)) {
                    return a.last.compareTo(b.last);
                } else if (!a.first.equals(b.first)) {
                    return a.first.compareTo(b.first);
                }
                return a.middle.compareTo(b.middle);
            }
        });
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            for (Name k : a) {
                if (k.check(s)) {
                    System.out.println(k);
                }
            }
        }
    }
}
