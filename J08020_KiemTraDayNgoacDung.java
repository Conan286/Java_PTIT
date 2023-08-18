import java.io.*;
import java.util.*;
import java.math.*;
public class J08020_KiemTraDayNgoacDung {
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
    Stack<Character>st = new Stack<>();
    st.clear();
    char []c = s.toCharArray();
    for(Character i : c)
    {
    if((st.empty()&&(i==')'||i=='}'||i==']')) || ((!st.empty())&&((st.peek()!='{'&&i=='}')||(st.peek()!='['&&i==']')||(st.peek()!='('&&i==')'))))
        return false;    
    if(i=='{'||i=='['||i=='(')
        st.push(i);
    else 
        st.pop();
    }
    return st.empty();
    }
}
