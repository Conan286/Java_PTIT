//B21DCCN441
import java.util.*;
import java.io.*;
import java.math.*;

class Sv {

    public String id, ten, lop, mail;

    public Sv(String id, String ten, String lop, String mail) {

        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public void display() {
        System.out.printf("%s %s %s %s\n", id, ten, lop, mail);
    }
}

public class J05022_LietKeSinhVienTheoLop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sv> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
     
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){
        String lop = sc.nextLine();
        System.out.println("DANH SACH SINH VIEN LOP "+lop+":");
        for (Sv p : a) {
            if(p.lop.equals(lop))
            p.display();
        }
        }
    }
}