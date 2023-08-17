import java.util.*;
public class J01016_ChuSo4VaChuSo7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(ptit(n));
        
    
    }
    public static String ptit(String n)
    {
    int cnt = 0;
    for(Character i : n.toCharArray())
       if(i=='4'||i=='7')
           ++cnt;
    if(cnt==4||cnt==7) return "YES";
    else return "NO";           
    }
}

