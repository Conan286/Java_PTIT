//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;

class GameThuPtit {

    private String id, name;
    private int h, m, time;

    public GameThuPtit(String id, String name, String timeIn, String timeOut) {
        this.id = id;
        this.name = name;
        int in = Integer.valueOf(timeIn.substring(0, 2)) * 60 + Integer.valueOf(timeIn.substring(3, 5));
        int out = Integer.valueOf(timeOut.substring(0, 2)) * 60 + Integer.valueOf(timeOut.substring(3, 5));
        this.time = out - in;
        this.h = time / 60;
        this.m = time % 60;
    }

    public int getTime() {
        return this.time;
    }

    public int time() {
        return h * 60 + m;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + h + " gio " + m + " phut";
    }
}

public class J05011_TinhGio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GameThuPtit> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new GameThuPtit(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<GameThuPtit>() {
            @Override
            public int compare(GameThuPtit t, GameThuPtit t1) {
                return t.getTime() > t1.getTime() ? -1 : 1;
            }
        });
        for (GameThuPtit gamer : a) {
            System.out.println(gamer);
        }
    }
}
