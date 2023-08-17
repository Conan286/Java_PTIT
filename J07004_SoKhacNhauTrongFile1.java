import java.util.*;
import java.io.*;
import java.math.*;
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        File read = new File("DATA.in");
        Scanner sc = new Scanner(read);
        TreeMap <Integer,Integer> tm = new TreeMap<>();
        while(sc.hasNext())
        {
        int k = Integer.valueOf(sc.next());
        if(tm.containsKey(k))
            tm.put(k, tm.get(k)+1);
        else
            tm.put(k, 1);
        }
        for(Integer x : tm.keySet())
            System.out.println(x+" "+tm.get(x));
        }
    }

