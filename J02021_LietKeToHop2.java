import java.util.*;
import java.io.*;
public class J02021_LietKeToHop2 {
    public static int n,k,cnt=0;
    public static int ok = 1;
    public static int []a = new int[29];
    public static void begin()
    {
    for(int i = 1;i<=k;i++)
        a[i] = i;
    }
    public static void generate()
    {
    int i = k;
    while(i>0 && a[i]==n-k+i){
    a[i--]--;
    }
    if(i==0) ok = 0;
    else{
    a[i]++;
    for(int j = i+1;j<=k;j++)
        a[j]=a[j-1]+1;
    }
    }
    public static void print()
    {
        cnt++;
    for(int i = 1;i<=k;i++)
            System.out.print(a[i]);
        System.out.print(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        begin();
        while(ok>0)
        {
        print();
        generate();
        }
        System.out.println("\nTong cong co "+cnt+" to hop");
    }
}
