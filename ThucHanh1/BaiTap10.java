import java.io.*;
import java.math.*;
import java.util.*;
public class BaiTap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char []c = s.toCharArray();
        int n = s.length();
        Stack<Character>st = new Stack<>();
        int i = 0;
        while(i<n-1){
        int j = 1;//j dem so ki tu giong nhau lien tiep tinh tu vi tri i 
        while(i<n-1&&c[i]==c[i+1])
        {
        ++j;
        ++i;
        }
        //dieu kien de them c[i] vao stack
        if(j%2==1 && (st.empty()||c[i]!=st.peek()))
            st.push(c[i]);
        //dieu kien de pop c[i] khoi stack
        else if(j%2==1&&!st.empty()&&st.peek()==c[i])
            st.pop();
        i++;
        }
        if(i==n-1 && (st.empty()||c[i]!=st.peek())){
            st.push(c[i]);
        }
        else if(i==n-1&&!st.empty()&&st.peek()==c[i]){
            st.pop();
        }
        if(st.empty()) System.out.println("Empty String");
        else
        for(int j = 0;j<st.size();j++)
            System.out.print(st.elementAt(j));
        }
    }