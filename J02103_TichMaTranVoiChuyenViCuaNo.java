import java.util.*;
import java.io.*;
public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = t;
        while(t-->0)
        {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]a= new int[n][m];
        int [][]b = new int[m][n];
        int [][]c = new int[n][n];
        for(int i = 0;i < n;i++)
            for(int j = 0;j<m;j++)
            {
            a[i][j] = sc.nextInt();
            b[j][i] = a[i][j];
            }
        for(int i = 0;i < n;i++)
            for(int j = 0;j<n;j++){
                c[i][j]=0;
           for(int h = 0; h < m ; h++)
               c[i][j]+=a[i][h]*b[h][j];
                       }
        System.out.println("Test "+(k-t)+":");
        for(int i = 0;i < n;i++){
            for(int j = 0;j<n;j++)
                System.out.print(c[i][j]+" ");
            System.out.println("");
        }
    }
}
}
