import java.util.*;
public class BaiTap14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n;i++)
            a[i]=sc.nextInt();
        toiyeuptit(a);
    }
    public static void toiyeuptit(int []a)
    {
    int n = a.length;
    int b = 0;
    for(int i = 0; i< n ;i++)
    {
            int x = a[i],j=i-1;
            while(j>=0 && x<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1] = x;
            System.out.print("Buoc "+(b++)+": ");
            for(int k = 0; k<=i;k++)
                System.out.print(a[k]+" ");
            System.out.println("");
        
    }
}
}
