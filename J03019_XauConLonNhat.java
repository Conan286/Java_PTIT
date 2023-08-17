import java.util.*;
import java.io.*;
import java.math.*;
public class J03019_XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char []a = s.toCharArray();
        char []b = new char[n];
        b[n-1] = a[n-1];
        for(int i = n-2 ; i>=0;i--)
        {
        b[i] = b[i+1]>a[i]?b[i+1]:a[i];
        }
        String ans = "";
        for(int i = 0; i<n;i++)
            if(a[i]==b[i])
                ans+=b[i];
        System.out.println(ans);
        
    }
//example:
//ababba
//bbbbba
// b bba
//
//abbcbccacbbcbaaba
//ccccccccccccbbbba
//   c cc c  cb  ba
}
