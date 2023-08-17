import java.util.*;
import java.io.*;
import java.math.*;
public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TreeSet<Character> ts = new TreeSet<>();
        for(Character i:s.toCharArray())
            ts.add(i);
        System.out.println(ts.size());
    }
}
