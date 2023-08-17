
import java.util.*;

public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            double s = (double)h*0.5/n;
            
            //a=h b=01 a/b=h a*b/2 = a*a/h = s*i
            for(int i = 1; i < n ; i++){
               double h1 = Math.sqrt(s*2*i*h);
                System.out.printf("%.6f ",h1);
            }
              System.out.println("");
        }
    }

}

