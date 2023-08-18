import java.io.*;
import java.math.*;
import java.util.*;

public class J08024_So0VaSo9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Deque<String> dq = new ArrayDeque<>();
            dq.push("9");
            while (dq.size() > 0) {
                String top = dq.peekLast();
                dq.pollLast();

                if (check(top, n)) {
                    System.out.println(top);
                    break;
                }
                dq.push(top + "0");
                dq.push(top + "9");
            }
        }
    }

    public static boolean check(String s, int n) {
        BigInteger ss = new BigInteger(s);
        BigInteger nn = new BigInteger(String.valueOf(n));
        BigInteger cc = new BigInteger("0");
        BigInteger mod = ss.mod(nn);
        return (cc.equals(mod));
    }
}
