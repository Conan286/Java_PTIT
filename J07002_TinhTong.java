import java.util.*;
import java.io.*;
import java.math.*;
public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext())
        {
        String ptit = sc.next();
        try{
        int k = Integer.valueOf(ptit);
        sum += (long)k;
        }
        catch(NumberFormatException e)
        {
        
        }
        }
        System.out.println(sum);
    }
}
