//B21DCCN441
import java.math.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class J07085_TongChuSo {

    public static int Sum(String s) {
        int sum = 0;
        for (char i : s.toCharArray()) {
            sum += i - '0';
        }
        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        ArrayList<String> num = new ArrayList<String>();
        for (String w : a) {
            char[] c = w.toCharArray();
            int n = w.length();
            String Number = "";
            for (int i = 0; i < n; i++) {
                if (Character.isDigit(c[i])) {
                    Number += c[i];
                }
            }
            while (Number.charAt(0) == '0') {
                Number = Number.substring(1);
            }
            num.add(Number);
        }
        for (String k : num) {
            System.out.println(k + " " + Sum(k));
        }
    }
}
