import java.util.*;
public class J01024_SoTamPhan {
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
    for(Character i : s.toCharArray())
        if(i!='0' && i!='1' && i!='2')
            return false;
    return true;
    }
}
