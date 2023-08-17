import java.util.*;
import java.io.*;
import java.math.*;
public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
         String s = sc.nextLine();
         StringTokenizer ss = new StringTokenizer(s);
         int c = 0, l = 0,n = 0;
         while(ss.hasMoreTokens())
         {
         int x = Integer.valueOf(ss.nextToken());
            if(x%2==0)++c;
            else ++l;
         }
         n = c + l;
         if((n%2==0 && c>l)||(n%2!=0&&l>c)) System.out.println("YES");
         else System.out.println("NO");
        }
    }
}
