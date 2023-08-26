import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
class FullName{
public String first,middle,last;
public FullName(String a)
{
ArrayList<String>ar = new ArrayList<>();
StringTokenizer ss = new StringTokenizer(a);
while(ss.hasMoreTokens())
{
ar.add(ss.nextToken());
}
first = ar.get(0);
last = ar.get(ar.size()-1);
middle = "";
for(int i = 1;i<ar.size()-1;i++)
    middle += ar.get(i)+" ";
middle = middle.substring(0,middle.length()-1);
}
@Override
public String toString()
{
return first+" "+middle+" "+last;
}
}
public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<FullName>a = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer ss = new StringTokenizer(s.toLowerCase());
            String ans = "";
            while(ss.hasMoreTokens())
            {
            String z = ss.nextToken();
            char x = (char) (z.charAt(0) - 32);
            ans += x + z.substring(1)+" ";
            }
            a.add(new FullName(ans.substring(0,ans.length()-1)));
        }
        Collections.sort(a,new Comparator<FullName>(){
            @Override
            public int compare(FullName a, FullName b) {
                if(!a.last.equals(b.last))
                    return a.last.compareTo(b.last);
                else if(!a.first.equals(b.first))
                    return a.first.compareTo(b.first);
                return a.middle.compareTo(b.middle);
            }        
        });
        for(FullName k:a)
            System.out.println(k);
       }
}
