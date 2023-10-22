//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;
public class bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        int n = sc.nextInt();
        System.out.println(X(n));
        }
    }
    public static boolean check(String s,int n)
    {
    int len = s.length(),res = 0;
    for(int i=0;i<len;i++)
        res = (res*10+s.charAt(i)-'0')%n;
    return res ==0;
    }
    public static String X(int n)
    {
    String ans = "9";
    Deque <String> dl = new ArrayDeque<>();
    dl.push(ans);
    while(true)
    {
    ans = dl.peekLast(); dl.removeLast();
    
    if(check(ans,n)) return ans;
    dl.push(ans+"0");
    dl.push(ans+"9");
    }    
    }
}
