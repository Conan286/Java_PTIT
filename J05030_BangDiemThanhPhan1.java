//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class Student {

    public String id, name, lop;
    public double m1, m2, m3;

    public Student(String id, String name, String lop, double m1, double m2, double m3) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display() {
        System.out.printf("%s %s %s %.1f %.1f %.1f\n", id, name, lop, m1, m2, m3);
    }
}

public class J05030_BangDiemThanhPhan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a, new Comparator<Student>() {
            @Override
            public int compare(Student t, Student t1) {
                return t.id.compareTo(t1.id);
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", i + 1);
            a.get(i).display();
        }
    }
}
