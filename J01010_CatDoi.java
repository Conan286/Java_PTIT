import java.util.*;
public class J01010_CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while(t-->0)
        {
        String n = sc.next();
        System.out.println(ptit(n));
        }
    }
     public static String ptit(String n)
     {
     String ans = "";
     int c1 = 0;
     for(Character i: n.toCharArray())
     {
     if(i!='0'&&i!='1'&&i!='8'&&i!='9') return "INVALID";
     else if(i=='1') {ans+="1"; c1=1;}
     else if(i=='0'||i=='8'||i=='9') ans+="0";    
     }
     if(c1==0)return "INVALID";
     StringBuilder mp40 = new StringBuilder(ans);
     while(mp40.charAt(0)=='0') mp40.deleteCharAt(0);
     return mp40.toString();
     }
}
