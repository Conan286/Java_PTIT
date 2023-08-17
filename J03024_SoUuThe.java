import java.util.*;
import java.math.*;
import java.io.*;
public class J03024_SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextByte();
        while(t-->0)
        {
        String s = sc.next();
        if(!check1(s)) System.out.println("INVALID");
        else if(check(s)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check1(String x)
    {
    int c = 0, l = 0, n = x.length();
    char []s = x.toCharArray();
    if(s[0]=='0') return false;
     for(Character i : s){
         if(i>'9' || i<'0')
             return false;
    }
    return true;
    }
    public static boolean check(String x)
    {
    int c = 0, l = 0, n = x.length();
    char []s = x.toCharArray();
     for(Character i : s){
          int k = i-'0';
        if(k%2==0)++c;
        else ++l;
    }
    return (n%2!=0 && l>c)||(n%2==0 && c>l);
    }
}
