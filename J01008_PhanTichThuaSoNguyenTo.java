import java.util.*;
public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        int k = t;
        while(t-->0)
        {
        int n = sc.nextInt();       
        System.out.print("Test "+(k-t)+": ");
        ptit(n);
            System.out.println("");
        }
    }
    public static void ptit(int n)
    {
    for(int i = 2; i<=(int)Math.sqrt(n);i++)
    {
    if(n%i==0)
    {
    int cnt = 0;
    while(n%i==0)
    {
    n/=i;
    ++cnt;
    }
        System.out.print(i+"("+cnt+") ");
    }
    }
    if(n>1) System.out.print(n+"("+1+")");
    }
}
