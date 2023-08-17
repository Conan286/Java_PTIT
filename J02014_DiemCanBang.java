import java.util.*;
public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n;i++)
        a[i]=sc.nextInt();
        System.out.println(toiyeuptit(a));
    }
    }
    public static int toiyeuptit(int []a)
    {
    int mid = -1,sum = 0,n=a.length,s=a[0];
    for(int i = 0;i<n;i++)
        sum+=a[i];
    for(int i = 1;i<n-1;i++)
    {
    if(sum-s-a[i]==s) return i+1;
    s+=a[i];
    }
    return mid;
    }
}
