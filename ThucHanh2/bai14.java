import java.util.*;
import java.io.*;
import java.math.*;
public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        int n = sc.nextInt();
        for(int i = 1; i < n;i++)
        {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(tm.containsKey(x))
            tm.put(x, tm.get(x)+1);
        else
            tm.put(x, 1);
        if(tm.containsKey(y))
            tm.put(y, tm.get(y)+1);
        else
            tm.put(y, 1);
        }
        int cnt_c=0;
        int cnt_d=0;
        for(Integer k:tm.keySet())
        {
        if(tm.get(k)==n-1)++cnt_d;
        if(tm.get(k)==1) ++cnt_c;
        }        
        if(cnt_d==1&&cnt_c==n-1||(n==2 && tm.size()==2)) System.out.println("Yes");
        else System.out.println("No");
    }
}
