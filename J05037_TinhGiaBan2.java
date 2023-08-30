//B21DCCN441
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
class SanPham{
private String id,th,dvt;
private int dgn,sl,pvc,tt,gb;
public SanPham(int i,String th,String dvt,int dgn,int sl){
this.id="";
if(i<10) this.id="MH0"+i;
else this.id ="MH"+i;
this.th = th;
this.dvt = dvt;
this.dgn = dgn;
this.sl = sl;
double ship = this.dgn*this.sl*5/100;
this.pvc = round(ship);
double thanhtien = this.dgn*this.sl + ship;
this.tt = round(thanhtien);
double giaban = (thanhtien + thanhtien*0.02)/this.sl;
this.gb = roundGb(giaban);
}
public int roundGb(double gb)
{
int k = (int)gb;
int m = k%100;
k = (int)(k/100);
if(m>0) k+=1;
return k*100;
}
public int round(double ship)
{
int k = (int)ship;
double h = ship - k;
if(h>=0.5) k += 1;
return k;
}
public int getGiaSanPham()
{
return this.gb;
}
@Override
public String toString()
{
return this.id+" "+this.th+" "+this.dvt+" "+this.pvc+" "+this.tt+" "+this.gb;
}
}
public class J05037_TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SanPham>a = new ArrayList<>();
        for(int i = 1;i<=n;i++)
        {
        sc.nextLine();
        a.add(new SanPham(i,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(a,new Comparator<SanPham>(){
            @Override
            public int compare(SanPham t, SanPham t1) {
                return t.getGiaSanPham()>t1.getGiaSanPham()?-1:1;
            }
        });
        for(SanPham hh:a)
            System.out.println(hh);
    }
}