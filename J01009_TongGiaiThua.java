import java.util.*;
public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = 1,sum = 1;
        for(long i = 2; i <= n ; i++)
        {
        s*=i;
        sum+=s;
        }
        System.out.println(sum);
    }
}
