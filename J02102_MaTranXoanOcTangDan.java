import java.util.*;
import java.io.*;
import java.math.*;
public class J02102_MaTranXoanOcTangDan {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n*n];
        int [][]a = new int[n][n];
        for(int i = 0;i<n*n;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        
        int cnt = 0;
        int ht=0,ct=0,hd=n-1,cd=n-1;
        while(cnt<n*n)
        {
        for(int i = ct; i<=cd;i++)
            a[ht][i]=arr[cnt++];
        for(int i = ht+1; i<=hd;i++)
            a[i][cd]=arr[cnt++];
        if(ct<=cd)
            for(int i = cd-1;i>=ct;i--)
                a[hd][i]=arr[cnt++];
        if(ht<=hd)
            for(int i = hd-1;i>ht;i--)
                a[i][ct]=arr[cnt++];
        ht++;
        ct++;
        hd--;
        cd--;
        }
        for(int i = 0;i<n;i++)        {
        for(int j = 0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println("");
        }
     }
}
