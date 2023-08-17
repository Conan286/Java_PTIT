import java.util.*;
public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while(t-->0)
        {
        int a = sc.nextInt();
            System.out.println(count2(a));
        }
    }
     public static int count2(int n)
    {
       int cnt = 0;
       if(n%2!=0) return 0;
       if(n==2) return 1;
       if(n%2==0)++cnt;
       int k = (int)Math.sqrt(n);
       for(int i = 2; i<=k; i++)
       {
       if(n%i==0)
       {
       int x1 = i, x2 = n/i;
       if(x1!=x2){
       if(x1%2==0)++cnt;
       if(x2%2==0)++cnt;
       }
       else{           
           if(x1%2==0)++cnt;
       }}
       }
       return cnt;
    }     
}
