
import java.math.*;
import java.lang.*;
import java.io.*;
import java.util.*;

class TramDoMua {

    public String name, id;
    public Float LuongMuaTrungBinh;
    public int time, TongLuongMua;

    public TramDoMua(String name, int i) {
        this.name = name;
        this.id = "T" + i;
        if (i < 10) {
            this.id = "T0" + i;
        }
        this.TongLuongMua = 0;
        this.time = 0;

    }

    public void setLuongMua(int t) {
        this.TongLuongMua = t;
    }

    public void setTime(int t) {
        this.time = t;
    }

    public void display() {
        this.LuongMuaTrungBinh = (float) (this.TongLuongMua * 60.0 / this.time);
        System.out.printf("%s %s %.2f\n", this.id, this.name, this.LuongMuaTrungBinh);
    }

}

public class J05019_LuongMuaTrungBinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> Luongmua = new TreeMap<>();
        TreeMap<String, Integer> timeRain = new TreeMap<>();
        int cnt = 1;
        ArrayList<TramDoMua> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String st = sc.nextLine();
            String fn = sc.nextLine();
            int luongMua = sc.nextInt();
            int start = Integer.valueOf(st.substring(0, 2)) * 60 + Integer.valueOf(st.substring(3, 5));
            int finish = Integer.valueOf(fn.substring(0, 2)) * 60 + Integer.valueOf(fn.substring(3, 5));
            int time = finish - start;

            if (Luongmua.containsKey(name)) {
                Luongmua.put(name, Luongmua.get(name) + luongMua);
                timeRain.put(name, timeRain.get(name) + time);
            } else {
                Luongmua.put(name, luongMua);
                timeRain.put(name, time);
                a.add(new TramDoMua(name, cnt++));
            }
        }
        for (String i : Luongmua.keySet()) {
            for (TramDoMua t : a) {
                if (t.name.equals(i)) {
                    t.setLuongMua(Luongmua.get(i));
                    t.setTime(timeRain.get(i));
                }
            }
        }
        for (TramDoMua t : a) {
            t.display();
        }
    }
}
