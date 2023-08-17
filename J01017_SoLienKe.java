import java.util.*;
public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check(String s)
    {
    char []c = s.toCharArray();
    int n = c.length;
    for(int i=0;i<n-1;i++)
    {
    if(Math.abs(c[i]-c[i+1])!=1) return false;
    }
    return true;
    }
}
