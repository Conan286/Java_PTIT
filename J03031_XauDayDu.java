import java.util.*;
import java.io.*;
import java.math.*;
public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String s = sc.next();
        int k = sc.nextInt();
        if(check(s,k)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check(String s,int k)
    {
    TreeSet<Character> ts = new TreeSet<>();
    for(Character i : s.toCharArray())
        ts.add(i);
    return (ts.size()+k>=26);
    }
}
