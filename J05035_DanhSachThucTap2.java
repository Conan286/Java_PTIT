import java.util.*;
import java.lang.*;
import java.math.*;
class SinhVienPtit {
private int stt;
private String id,name,lop,mail,dn;
public SinhVienPtit(int i,String msv,String ht,String l,String email,String dn){
this.stt = i;
this.id = msv;
this.name = ht;
this.mail = email;
this.lop = l;
this.dn = dn;
}
public String getDn()
{
return this.dn;
}
public String getId()
{
return this.id;
}
@Override
public String toString()
{
return String.valueOf(stt)+" "+this.id+" "+this.name+" "+this.lop+" "+this.mail+" "+this.dn;
}
}
public class J05035_DanhSachThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVienPtit>sv = new ArrayList<>();
        for(int i = 1;i<=n;i++)
        {
        sv.add(new SinhVienPtit(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(sv,new Comparator<SinhVienPtit>(){
            @Override
            public int compare(SinhVienPtit t, SinhVienPtit t1) {
            return t.getId().compareTo(t1.getId());
            }
        });
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String search = sc.nextLine();
        for(SinhVienPtit p:sv)
            if(p.getDn().equals(search))
                System.out.println(p);
        }
    }
}