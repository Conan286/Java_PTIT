import java.util.*;
import java.io.*;
public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer>t=new TreeMap<>();
        int max = 1,k=0;
        for(int i = 0; i<n;i++)
        {
        k = sc.nextInt();
        max = k>max?k:max;
        t.put(k, 1);
        }
        if(max==t.size()) System.out.println("Excellent!");
        else{
        for(int i = 1; i < max;i++){
            if(t.containsKey(i)) continue;
            else System.out.print(i+"\n");
        }
    }
}
}
