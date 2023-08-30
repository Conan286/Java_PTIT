import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
class GiangVienPtit{
public String id,name,lastName,boMon;
public GiangVienPtit(int i,String name,String bm)
{
this.id="";
if(i<10) this.id = "GV0"+i;
else this.id = "GV"+i;
this.name = name;
this.lastName = name.split(" ")[name.split(" ").length-1];
StringTokenizer ss = new StringTokenizer(bm.toUpperCase());
this.boMon="";
while(ss.hasMoreTokens())
    this.boMon += ss.nextToken().charAt(0);
}
@Override
public String toString()
{
return id+" "+name+" "+boMon;
}
}
public class J05025_SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<GiangVienPtit>a = new ArrayList<>();
        for(int i = 1; i<=n ;i++)
        {
        a.add(new GiangVienPtit(i,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a,new Comparator<GiangVienPtit>(){ 
            @Override
            public int compare(GiangVienPtit t, GiangVienPtit t1) {
                if(!t.lastName.equals(t1.lastName))
                    return t.lastName.compareTo(t1.lastName);
                return t.id.compareTo(t1.id);
            }
        });
        for(GiangVienPtit dz:a)
            System.out.println(dz);
    }
}
