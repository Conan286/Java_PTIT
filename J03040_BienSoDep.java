import java.util.*;
import java.io.*;
import java.math.*;
public class J03040_BienSoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String s = sc.next();
        s = s.substring(5,8)+s.substring(9,11);
            
        if(check1(s)||check2(s)||check3(s)||check4(s))
                System.out.println("YES");
        else 
                System.out.println("NO");
        }
    }
     public static boolean check1(String s)
     {
         char []c = s.toCharArray();
         return (c[0]==c[1] && c[1]==c[2] && c[2]==c[3] && c[3]==c[4]);
     }
     public static boolean check2(String s)
     {
         char []c = s.toCharArray();
         return (c[0]==c[1] && c[1]==c[2])&&(c[3]==c[4]);
     }
     public static boolean check3(String s)
     {
         char []c = s.toCharArray();
         for(int i = 1;i<c.length;i++)
             if(c[i]<=c[i-1])
                 return false;
         return true;
     }
     public static boolean check4(String s)
     {
         char []c = s.toCharArray();
         for(int i = 1;i<c.length;i++)
             if(c[i]!='6'&&c[i]!='8')
                 return false;
         return true;
     }
     
}
