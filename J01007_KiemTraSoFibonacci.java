import java.util.*;
public class J01007_KiemTraSoFibonacci {
    public static int N = 93;
    public static long []a = new long[N];
    public static void generate()
    {
    a[0] = 0;
    a[1] = 1;
    for(int i = 2; i < N ; i++) a[i] = a[i-1]+ a[i-2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        generate();
        while(t-->0)
        {
        long n = sc.nextLong();
       
        if(Arrays.binarySearch(a, n)>0) System.out.println("YES");
        else System.out.println("NO");
        }
    }
}
