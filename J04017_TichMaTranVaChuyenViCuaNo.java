//B21DCCN441
import java.math.*;
import java.io.*;
import java.lang.*;
import java.util.*;

class Matrix {

    public int r, c;
    public int[][] a;

    public Matrix(int n, int m) {
        this.r = n;
        this.c = m;
        this.a = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) {
        Matrix ans = new Matrix(this.r, b.c);
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < b.c; j++) {
                ans.a[i][j] = 0;
                for (int k = 0; k < this.c; k++) {
                    ans.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return ans;
    }
    
    public Matrix trans()
    {
    Matrix ans = new Matrix(this.c, this.r);
    for(int i=0;i<this.r;i++)
        for(int j = 0;j<this.c;j++)
            ans.a[j][i] = this.a[i][j];
    return ans;    
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.c; j++) {
                ans += String.valueOf(this.a[i][j]) + " ";
            }
            ans += "\n";
        }
        return ans;
    }

}

public class J04017_TichMaTranVaChuyenViCuaNo {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
