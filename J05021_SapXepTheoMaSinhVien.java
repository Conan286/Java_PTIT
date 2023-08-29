//B21DCCN441

import java.util.*;
import java.io.*;
import java.math.*;

class sv {

    public String id, ten, lop, mail;

    public sv(String id, String ten, String lop, String mail) {

        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public void display() {
        System.out.printf("%s %s %s %s\n", id, ten, lop, mail);
    }
}

public class J05021_SapXepTheoMaSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            a.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<sv>() {
            @Override
            public int compare(sv t, sv t1) {
                return t.id.compareTo(t1.id);
            }
        });
        for (sv p : a) {
            p.display();
        }
    }
}
