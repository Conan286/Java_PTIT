import java.io.*;
import java.math.*;
import java.util.*;
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        int n = sc.nextInt();
        solocphat(n);
        }
    }
    public static void solocphat(int n)
    {
    Vector<String>v=new Vector<>();
    Deque<String> dq = new ArrayDeque<>();
    dq.push("6");
    dq.push("8");
    while(dq.size()>0)
    {
    String t = dq.peekLast();
    dq.pollLast();
    if(t.length()<=n) v.add(t);
    if(t.length()<n){
    String t1 = t+"6";
    String t2 = t+"8";
    dq.push(t1);
    dq.push(t2);
    }
    }
        System.out.println(v.size());
    for(int i = v.size()-1;i>=0;i--)
            System.out.print(v.elementAt(i)+" ");
        System.out.println("");
    }
}
