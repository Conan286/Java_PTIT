import java.io.File;
import java.util.*;
public class J01001_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > 0 && b > 0)
        System.out.println((a+b)*2+" "+(a*b));
        else System.out.println("0");
    }    
}
