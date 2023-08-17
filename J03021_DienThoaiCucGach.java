import java.util.*;
import java.io.*;
import java.math.*;
public class J03021_DienThoaiCucGach {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int t = sc.nextInt();
       sc.nextLine();
       while(t-->0)
       {
       String s = sc.next();
       s = s.toUpperCase();
       String res = "";
       for(Character i : s.toCharArray())
       {
          if(i<='C') res+="2";
          else if(i<='F') res += "3";
          else if(i<='I') res += "4";
          else if(i<='L') res += "5";
          else if(i<='O') res += "6";
          else if(i<='S') res += "7";
          else if(i<='V') res += "8";
          else if(i<='Z') res += "9";
       }
       if(check(res)) System.out.println("YES");
       else System.out.println("NO");
       }
    }
    public static boolean check(String ss)
    {
    int l = 0, r = ss.length() - 1;
    char []s = ss.toCharArray();
    while(l<r)
        if(s[l++]!=s[r--])
           return false;
    return true;
    }
}
