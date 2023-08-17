import java.util.*;
import java.io.*;
public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        TreeMap<String,Integer>mp = new TreeMap<>();
        Vector<String>v=new Vector<>();
        sc.nextLine();
        while(t-->0)
        {
        String s = sc.nextLine();
        String ans = email(s);
        if(mp.containsKey(ans)){
            mp.put(ans, mp.get(ans)+1);
            int tt= mp.get(ans);
            ans += String.valueOf(tt);
            ans += "@ptit.edu.vn";
        }
        else{
        mp.put(ans, 1);
        ans += "@ptit.edu.vn";
        }
        v.add(ans);
        }
        for(String k:v)
            System.out.println(k);
    }
    public static String email(String s)
    {
    s = s.toLowerCase();
    String ans="";
    StringTokenizer ss = new StringTokenizer(s);
    Vector<String>v = new Vector<>();
    while(ss.hasMoreTokens())
        v.add(ss.nextToken());
    ans+=v.elementAt(v.size()-1);
    for(int i = 0 ; i < v.size() - 1 ; i ++)
    {
    char x = v.elementAt(i).charAt(0);
    ans += x;
    }
    
    return ans;
    }
}
