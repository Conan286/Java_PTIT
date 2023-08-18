import java.io.*;
import java.math.*;
import java.util.*;
public class J08022_PhanTuDauTienBenPhaiLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        int n = sc.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Stack<Integer>st=new Stack<>();
        st.push(a[n-1]);
        b[n-1] = -1;
        int j = n - 2;
        while(j>=0)
        {
        while(!st.empty() && a[j]>=st.peek()) st.pop();
        if(st.empty()) b[j] = -1;
        else b[j] = st.peek();
        st.push(a[j--]);
        }
         for(int i = 0; i < n; i++)
                System.out.print(b[i]+" ");
            System.out.println("");        
        }
    }
}