import java.util.*;
import java.io.*;
public class J03008_SoDep3 {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String s = sc.next();
        if(check1(s) && check2(s) ) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check1(String s)
    {
    char []c = s.toCharArray();
    int n = c.length,sum = 0;
    for(int i=0;i<n;i++)
    {
    if(c[i]!='2' && c[i]!='3'&& c[i]!='5'&&c[i]!='7')
        return false;
    }
    return true;
    }
     public static boolean check2(String s)
    {
    char []c = s.toCharArray();
    int n = c.length;
    int l = 0;
    int r = n-1;
    while(l<r)
        if(c[l++]!=c[r--])
            return false;
    return true;
    }
     


}
