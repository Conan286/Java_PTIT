import java.io.*;
import java.util.*;
import java.math.*;
class Delivery{
private String name,id,stt;
private long dg,sl,gg,tt;
public Delivery(String tenHang,String maDon,long dg,long sl)
{
this.name = tenHang;
this.id = maDon;
this.stt = maDon.substring(1,4);
this.sl = sl;
this.dg = dg;
this.gg = dg*50*sl/100;
if(maDon.charAt(4)=='2') this.gg = dg*30*sl/100;
this.tt = this.sl*this.dg - this.gg;
}
@Override
public String toString()
{
return name+" "+id+" "+stt+" "+gg+" "+tt;
}
public int getStt()
{
return Integer.valueOf(this.stt);
}
}
public class J05053_SapXepDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Delivery> a = new ArrayList<>();
        for(int i = 1;i<=n;i++)
        {
        sc.nextLine();
        a.add(new Delivery(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong()));
        }
        Collections.sort(a,new Comparator<Delivery>(){
            @Override
            public int compare(Delivery t, Delivery t1) {
                return t.getStt()>t1.getStt()?1:-1;
            }
        });
        for(Delivery dh:a)
            System.out.println(dh);
    }
}