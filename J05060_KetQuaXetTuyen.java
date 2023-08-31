//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;
class PhuHo{
private String id,name,trangThai;
private double lyThuyet,thucHanh,diemThuong;
private int age,diemXetTuyen;
public PhuHo(int i,String name,String birth,double lt,double th){
if(i<10) this.id = "PH0"+i;
else this.id = "PH"+i;
this.name = name;
this.age = 2021 - Integer.valueOf(birth.substring(6,10));
this.lyThuyet = lt;
this.thucHanh = th;
this.diemThuong = 0;
if(lt>=8 && th>=8) this.diemThuong = 1;
else if(lt>=7.5 && th >= 7.5) this.diemThuong = 0.5;
double p =  ((lt + th)/2.0) + this.diemThuong ;
int k = (int)p;
if(p-k>=0.5) k+=1;
if(k>10) k = 10;
this.diemXetTuyen = k;
this.trangThai="Truot";
if(this.diemXetTuyen>=9) 
    this.trangThai="Xuat sac";
else if(this.diemXetTuyen>=8) 
    this.trangThai="Gioi";
else if(this.diemXetTuyen>=7) 
    this.trangThai="Kha";
else if(this.diemXetTuyen>=5) 
    this.trangThai="Trung binh";
}
@Override
public String toString()
{
return this.id+" "+this.name+" "+this.age+" "+this.diemXetTuyen+" "+this.trangThai;
}
}
public class J05060_KetQuaXetTuyen {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<PhuHo> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new PhuHo(i,sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for(PhuHo ph:a)
            System.out.println(ph);
    }
}
