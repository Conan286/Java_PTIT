
import java.util.*;

public class J01004_SoNguyenTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (check(n) != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int check(int n) {
        int k = (int) Math.sqrt(n);
        for (int i = 2; i <= k; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
