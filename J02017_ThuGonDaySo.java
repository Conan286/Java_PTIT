import java.util.*;
public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n;i++)
            a[i]=sc.nextInt();
         Vector v = new Vector();
         for(int i = 0; i<n;i++)
         {
         if(v.size()==0) v.add(a[i]);
         else{
         int x = (int)v.elementAt(v.size()-1);
         if((x+a[i])%2!=0) v.add(a[i]);
         else v.removeElementAt(v.size()-1);
         }
         }
            System.out.println(v.size());
    }
    
}
