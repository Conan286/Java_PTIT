import java.util.*;
public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        TreeSet<Integer>t1=new TreeSet<>(); 
        int []a = new int [n1];
        int []b = new int [n2];
        for(int i = 0 ; i < n1 ;i++){
            a[i]=sc.nextInt();
            t1.add(a[i]);
        }
       for(int i = 0 ; i < n2 ;i++){
            b[i]=sc.nextInt();
            t1.add(b[i]);
       }   
       for(int k:t1)
         System.out.print(k+" ");
       }
    }