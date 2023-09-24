import java.math.*;
import java.util.*;
import java.io.*;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(Character c:s.toCharArray())
            if(c=='4'||c=='7')
                ++cnt;
        if(cnt==4||cnt==7)System.out.println("YES");
        else System.out.println("NO");
    }
}
