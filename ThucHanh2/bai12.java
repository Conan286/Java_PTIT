//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;
public class bai12 {
    public static int n;
    public static int ok = 1;
    public static int []a = new int[101];
    public static int []b = new int[101];
    public static void st()
    {
    for(int i = 0; i<=n;i++)
        a[i] = 0;
    }
    public static void generate()
    {
    int i = n;
    while(i>0 && a[i]==1)
        a[i--]=0;
    if(i==0) ok = 0;
    else a[i] = 1;
    }
    public static boolean check()
    {
    Vector<Integer>v = new Vector<>();
    for(int i = 1;i<=n;i++)
        if(a[i]==1)
            v.add(b[i]);
    if(v.size()<2) return false;
    for(int i = 0;i<v.size()-1;i++)
        if(v.elementAt(i)>=v.elementAt(i+1))
            return false;
    return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 1;i<=n;i++)
            b[i] = sc.nextInt();
        ArrayList<String>arr = new ArrayList<>();
        st();
        while(ok>0)
        {
        if(check())
        {
        String s ="";
        for(int i = 1;i<=n;i++)
        if(a[i]==1)
            s+=String.valueOf(b[i])+" ";
        arr.add(s);
        }
        generate();
        }
        Collections.sort(arr);
        for(String s:arr)
            System.out.println(s);
        
    }
}
