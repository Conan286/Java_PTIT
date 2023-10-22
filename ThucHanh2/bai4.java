//B21DCCN441
import java.io.*;
import java.math.*;
import java.util.*;



public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        TreeMap<String,Integer> mp = new TreeMap<>();
        while(t-->0)
        {
        String s = sc.nextLine();
        s = title(s);
        if(mp.containsKey(s))
        {
        mp.put(s, mp.get(s)+1);
        s += String.valueOf(mp.get(s));
        }
        else mp.put(s, 1);
        s += "@ptit.edu.vn";
        System.out.println(s);
        }
    }
    public static String title(String s)
    {
    StringTokenizer ss = new StringTokenizer(s);
    ArrayList<String> as = new ArrayList<>();
    while(ss.hasMoreTokens()) as.add(ss.nextToken().toLowerCase());
    int n = as.size();
    String ans = as.get(n-1);
    for(int i=0;i<n-1;i++)
        ans+= as.get(i).substring(0, 1);
    return ans;
    }
}
