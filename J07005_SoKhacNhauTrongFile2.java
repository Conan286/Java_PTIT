import java.util.*;
import java.io.*;
import java.math.*;
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap <Integer,Integer> tm = new TreeMap<>();
        int i = 0;
        while(i++<100000)
        {
        int k = sc.readInt();             
        if(tm.containsKey(k))
            tm.put(k, tm.get(k)+1);
        else
            tm.put(k, 1);
        }
        for(Integer x : tm.keySet())
            System.out.println(x+" "+tm.get(x));
        }
    }