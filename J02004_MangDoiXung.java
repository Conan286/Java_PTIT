import java.util.*;
public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        int n = sc.nextInt();
        int []a = new int [n];
        for(int i = 0 ; i < n ;i++)
            a[i]=sc.nextInt();
        if(check(a)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check(int []a)
    {
    int n = a.length;
    int l = 0 , r = n - 1;
    while(l<r)
        if(a[l++]!=a[r--]) 
            return false;
    return true;
    }
}
