//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

public class J07032_SoThuanNghichTrongFile {
    public static boolean check(int n)
    {
    String s = ""+n;
    char []c = s.toCharArray();
    int len = s.length();
    if(len==1 || len%2==0) return false;
    int r = len-1;
    int l = 0;
    while(l<r)
        if(c[l++]!=c[r--])
            return false;
    while(n>0)
    {
    int k = n%10;
    if(k%2==0) return false;
    n/=10;
    }
    return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        TreeMap<Integer,Integer> tm1 = new TreeMap<>();
        TreeMap<Integer,Integer> tm2 = new TreeMap<>();
        for(int k:a1)
        {
        if(tm1.containsKey(k)) tm1.put(k, tm1.get(k)+1);
        else tm1.put(k, 1);
        }
        for(int k:a2)
        {
        if(tm2.containsKey(k)) tm2.put(k, tm2.get(k)+1);
        else tm2.put(k, 1);
        }
        Collections.sort(a1);
        int cnt = 0;
        for (int n : a1) {
            if(check(n) && !tm.containsKey(n) && tm1.containsKey(n) && tm2.containsKey(n) )
            {
            cnt ++;
            tm.put(n, 1);
            System.out.println(n+" "+(tm1.get(n)+tm2.get(n)));
            }
            if(cnt==10) break;
        }
    }
}
