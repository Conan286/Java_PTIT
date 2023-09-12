//B21DCCN441
import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

class SV {

    public String id, name, phone, nameProject;
    public int idGroup;

    public SV(String msv, String ten, String sdt, int group) {
        this.id = msv;
        this.name = ten;
        this.phone = sdt;
        this.idGroup = group;
    }
    
    public void setNameofProject(String s)
    {
    this.nameProject = s;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.phone+" "+this.idGroup+" "+this.nameProject;
    }
}

public class J06004_QuanLyBaiTapNhom2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, String> project = new TreeMap<>();
        ArrayList<SV> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            String s = sc.nextLine();
            project.put(i, s);
            for(SV sv:a)
                if(sv.idGroup == i)
                    sv.setNameofProject(project.get(i));
        }
        Collections.sort(a,new Comparator<SV>(){
            @Override
            public int compare(SV t, SV t1) {
                return t.id.compareTo(t1.id);
            }
        });
        
        for(SV sv:a)
            System.out.println(sv);
        
    }
}