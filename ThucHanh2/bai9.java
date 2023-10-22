//B21DCCN441
import java.io.*;
import java.math.*;
import java.util.*;

class SV {

    public String name,lop,birth;
    public double score;
    public SV(String name,String lop,String b,double p) {
        this.name = name;
        this.lop = lop;
        this.birth = title(b);
        this.score = p;
    }
    public String title(String bi)
    {
    String b = bi;
    if(b.charAt(1)=='/') b = "0"+b;
    if(b.charAt(4)=='/') b = b.substring(0,3)+"0"+b.substring(3);
    return b;
    }


    @Override
    public String toString() {
        return "B20DCCN001"+" "+this.name+" "+this.lop+" "+this.birth+" "+String.format("%.2f", this.score);
        
    }
}

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SV a = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextFloat());
        System.out.println(a);
    }
}


 
