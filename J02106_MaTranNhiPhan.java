import java.util.*;
import java.io.*;
public class J02106_MaTranNhiPhan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][3];
        int cnt = 0;
        for(int i = 0; i<n;i++){
        int d1 = 0;
           for(int j = 0;j<3;j++){
               a[i][j] = sc.nextInt();
               if(a[i][j]==1)
                   ++d1;
           }
           if(d1>=2)++cnt;        
    }
        System.out.println(cnt);
    }
}
