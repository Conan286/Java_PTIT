import java.util.*;
import java.io.*;
import java.math.*;

public class BaiTap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =1;i<=t;i++){
        int n = sc.nextInt();
        int []a = new int[n];
        LinkedHashMap <Integer,Integer> mp = new LinkedHashMap<>();
        for(int j = 0;j<n;j++){
            a[j] = sc.nextInt();
            if(mp.containsKey(a[j]))
                mp.put(a[j], mp.get(a[j])+1);
            else
                mp.put(a[j], 1);
        }
            System.out.println("Test "+i+":");
            mp.keySet().forEach((item) -> {
                System.out.println(item+" xuat hien "+mp.get(item)+" lan");
            });
        }        
    }
}
