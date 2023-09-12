import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class LopHocPhan{
public String idSub,nameSub,idGroup,nameTeacher;

public LopHocPhan(String maMon,String tenMon,String maNhom,String giangVien)
{
this.idSub = maMon;
this.nameSub = tenMon;
this.idGroup = maNhom;
this.nameTeacher = giangVien;
}

@Override
public String toString()
{
return this.idGroup+" "+this.nameTeacher;
}
}

public class J05079_LopHocPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        TreeMap<String,String> tm = new TreeMap<>();
        ArrayList<LopHocPhan>a = new ArrayList<>();
        for(int i = 1;i<=n;i++)
        {
        String maMon = sc.nextLine();
        String tenMon = sc.nextLine();
        tm.put(maMon, tenMon);
        a.add(new LopHocPhan(maMon,tenMon,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a,new Comparator<LopHocPhan>(){
            @Override
            public int compare(LopHocPhan t, LopHocPhan t1) {
                return t.idGroup.compareTo(t1.idGroup);
            }
        });
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<m;i++)
        {
        String search = sc.nextLine();
        System.out.println("Danh sach nhom lop mon "+tm.get(search)+":");
        for(LopHocPhan p:a)
            if(p.idSub.equals(search))
                System.out.println(p);
        }
    }
}
