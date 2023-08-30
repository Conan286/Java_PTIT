//B21DCCN441

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class soPhuc {

    public int phanThuc, phanAo;

    public soPhuc(int r, int i) {
        phanThuc = r;
        phanAo = i;
    }

    public soPhuc Cong(soPhuc x) {
        return new soPhuc(this.phanThuc + x.phanThuc, this.phanAo + x.phanAo);
    }

    public soPhuc Nhan(soPhuc x) {
//a+bi c+di
//a*c-b*d
//a*d+b*c
        return new soPhuc(this.phanThuc * x.phanThuc - this.phanAo * x.phanAo, this.phanThuc * x.phanAo + this.phanAo * x.phanThuc);
    }

    @Override
    public String toString() {
        return String.valueOf(phanThuc) + " + " + String.valueOf(phanAo) + "i";
    }
}

public class J04018_SoPhuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            soPhuc a = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc b = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc c = a.Cong(b).Nhan(a);
            soPhuc d = a.Cong(b).Nhan(a.Cong(b));
            System.out.println(c + ", " + d);
        }
    }
}
