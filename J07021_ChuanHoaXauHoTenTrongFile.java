import java.io.*;
import java.math.*;
import java.util.*;
public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine())
        {
        String s = sc.nextLine();
        if(s.equals("END")) break;
        if(s.length()==0) continue;
        StringTokenizer ss = new StringTokenizer(s);
        String ans="";
        while(ss.hasMoreTokens())
        {
        String w = ss.nextToken();
        w = w.toLowerCase();
        char x = (char) (w.charAt(0)-32);
        w = x + w.substring(1);
        ans+=w+" ";
        }
        ans=ans.substring(0,ans.length()-1);
            System.out.println(ans);
        }
    }
}
