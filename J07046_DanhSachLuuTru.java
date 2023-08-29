import java.util.*;
import java.math.*;
import java.io.*;
class Khach{
public String mkh,tkh,mp,in,out;
public int snlt;
public Khach(int id,String name,String room,String dayin,String dayout)
{
if(id<10) mkh="KH0"+String.valueOf(id);
else mkh="KH"+String.valueOf(id);
this.tkh = name;
this.mp = room;
this.in = dayin;
this.out = dayout;
this.snlt = dis(this.in,this.out);
}
public int dayOfYear(int y)
{
if(y%400==0 || (y%4==0 && y%100!=0)) return 366;
else return 365;
}
public int dayOfMonth(int m,int y)
{
if (m==1||m==3||m==5||m==7||m==8||m==10||m==12) return 31;
else if(m!=2) return 30;
else if(y%400==0 || (y%4==0 && y%100!=0)) return 29;
else return 28;
}
public int dayth(int d,int m,int y)
{
if(m==1) return d;
int day = 0;
for(int i = 1;i<m;i++)
    day += dayOfMonth(i,y);
return day+d;
}
public int dis(String a,String b) 
{
int d1 = Integer.valueOf(a.substring(0,2));
int d2 = Integer.valueOf(b.substring(0,2));
int m1 = Integer.valueOf(a.substring(3,5));
int m2 = Integer.valueOf(b.substring(3,5));
int y1 = Integer.valueOf(a.substring(6,10));
int y2 = Integer.valueOf(b.substring(6,10));
int distance = 0;
if(y1!=y2){
for(int i = y1+1;i<y2;i++)
    distance += dayOfYear(i);
distance += dayth(d2,m2,y2);
distance += dayOfYear(y1) - dayth(d1,m1,y1);
return distance;
}
return dayth(d2,m2,y2) - dayth(d1,m1,y1);
}

@Override
public String toString()
{
return this.mkh+" "+this.tkh+" "+this.mp+" "+this.snlt;
}
}
public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Khach>a = new ArrayList<>();
        for(int i = 1;i<=n;i++)
            a.add(new Khach(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        Collections.sort(a,new Comparator<Khach>(){
            @Override
            public int compare(Khach t, Khach t1) {
                return t.snlt>t1.snlt?-1:1;
            }        
        });
        for(Khach k:a)
            System.out.println(k);
    }
}
