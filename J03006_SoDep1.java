import java.util.*;
public class J03006_SoDep1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String s = sc.next();
        if(check1(s) && check2(s)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check1(String s)
    {
    char []c = s.toCharArray();
    int n = c.length;
    for(int i=0;i<n;i++)
    {
    if((c[i]-'0')%2!=0) return false;
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
