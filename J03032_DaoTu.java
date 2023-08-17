import java.util.*;
import java.io.*;
import java.math.*;
public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String a = sc.nextLine();
        Vector<String> v = new Vector<>();
        StringTokenizer s = new StringTokenizer(a);
        while(s.hasMoreElements()){
            StringBuilder ss = new StringBuilder(s.nextToken());
            ss.reverse();
            String x = ss.toString();
            v.add(x);
        }
        for(String mp:v)
                System.out.print(mp+" ");
            System.out.println("");
        }
    }
}
