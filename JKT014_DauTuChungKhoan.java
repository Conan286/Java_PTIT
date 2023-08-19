import java.io.*;
import java.math.*;
import java.util.*;

class Pa {

    int key;
    int index;
    int value;

    public Pa(int key, int index, int value) {
        this.key = key;
        this.index = index;
        this.value = value;
    }
}

public class JKT014_DauTuChungKhoan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            b[0] = -1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Pa> st = new Stack<>();
            st.push(new Pa(a[0], 0, b[0]));

            for (int i = 1; i < n; i++) {
                while (!st.empty() && a[i] >= st.peek().key) {
                    st.pop();
                }
                if (st.empty()) {
                    b[i] = -1;
                    st.push(new Pa(a[i], i, b[i]));
                } else {
                    b[i] = st.peek().index;
                    st.push(new Pa(a[i], i, b[i]));
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print((i - b[i]) + " ");
            }
            System.out.println("");
        }
    }
}
