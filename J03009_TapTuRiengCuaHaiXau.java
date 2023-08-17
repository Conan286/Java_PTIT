import java.util.*;
import java.io.*;
public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringTokenizer tk1 = new StringTokenizer(s1);
        StringTokenizer tk2 = new StringTokenizer(s2);
        TreeSet<String>t1 = new TreeSet<>();
        TreeSet<String>t2 = new TreeSet<>();
        while(tk1.hasMoreTokens())
            t1.add(tk1.nextToken());
        while(tk2.hasMoreTokens())
            t2.add(tk2.nextToken());
        for(String ss : t1){
            if(t2.contains(ss))
                continue;
            else System.out.print(ss+" ");
        }
            System.out.println("");
    }
}
}
