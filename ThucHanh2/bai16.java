//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;
public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check(String s)
    {
    Stack <Character> sc = new Stack<>();
    int n = s.length();
    for(Character i:s.toCharArray())
    {     
    if(i=='{'||i=='('||i=='[') sc.push(i);
    else if((sc.empty() && (i==')'||i==']'||i=='}'))||(!sc.empty() && ((sc.peek()=='('&&i!=')')||(sc.peek()=='['&&i!=']')||(sc.peek()=='{'&&i!='}')))) return false;
    else sc.pop();
    }
    if(sc.empty())
    return true;
    return false;
    }
}
