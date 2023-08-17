import java.util.*;
public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        TreeSet<Integer>t1=new TreeSet<>(); 
        TreeSet<Integer>t2=new TreeSet<>();
        int []a = new int [n1];
        int []b = new int [n2];
        for(int i = 0 ; i < n1 ;i++){
            a[i]=sc.nextInt();
            t1.add(a[i]);
        }
       for(int i = 0 ; i < n2 ;i++){
            b[i]=sc.nextInt();
            t2.add(b[i]);
       }   
       for(int k:t2)
           if(t1.contains(k))
               System.out.print(k+" ");
       }
    }