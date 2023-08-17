import java.util.*;
import java.io.*;
public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String s = sc.next();
        int n = s.length();
        int l = 0, r = n-1,d=0;
        char []c = s.toCharArray();
        while(l<r)
        {
        if(c[l++]!=c[r--])
            ++d;
        }
        if((d==0 && n%2!=0)||d==1) System.out.println("YES");
        else System.out.println("NO");
        }
}
}
