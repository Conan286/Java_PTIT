import java.util.*;
import java.io.*;
import java.math.*;

class Pair{
    int key;
    int value;    
    public Pair(int key,int value){
        this.key = key;
        this.value = value;
    }    
}
public class J08026_BienDoiST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
        int s = sc.nextInt();
        int t = sc.nextInt();          
        Deque<Pair>dq= new ArrayDeque<>();
        TreeSet<Integer> ts = new TreeSet<>();
        dq.push(new Pair(s,0));
        ts.add(0);
        int cnt = 0, key = s;
         while(true)
        {
        Pair top = dq.peekLast();
        dq.pollLast();
        cnt = top.value;
        key = top.key;
        if(key==t){ break;}
        int t1 = key*2;
        int t2 = key-1;
        if(t1<2*t && !ts.contains(t1)){ dq.push(new Pair(t1,cnt+1)); ts.add(t1);}
        if(t2>0 && !ts.contains(t2)) { dq.push(new Pair(t2,cnt+1)); ts.add(t2);}
        }
         System.out.println(cnt); 
        }
    }
}
