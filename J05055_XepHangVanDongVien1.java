//B21DCCN441
import java.io.*;
import java.util.*;
import java.math.*;

class VanDongVien {

    private String id, hoTen, ngaySinh, timeRank, time, timePlus;
    private int timeRun, age, uuTien, rank;

    public VanDongVien(String id, String name, String birth, String in, String out) {
        this.id = id;
        this.hoTen = name;
        this.ngaySinh = birth;
        this.age = 2021 - Integer.valueOf(birth.substring(6, 10));
        this.timePlus = "00:00:00";
        if (this.age >= 32) {
            this.timePlus = "00:00:03";
            this.uuTien = 3;
        } else if (this.age >= 25) {
            this.timePlus = "00:00:02";
            this.uuTien = 2;
        } else if (this.age >= 18) {
            this.timePlus = "00:00:01";
            this.uuTien = 1;
        }
        this.timeRun = Time(in, out);
        this.time = stringOfTime(this.timeRun);
        this.timeRank = stringOfTime(this.timeRun - this.uuTien);
    }

    public void setRank(int ranking) {
        this.rank = ranking;
    }

    public int getTimeRank() {
        return this.timeRun - this.uuTien;
    }

    public int Time(String in, String out) {
        int tIn = Integer.valueOf(in.substring(0, 2)) * 3600 + Integer.valueOf(in.substring(3, 5)) * 60 + Integer.valueOf(in.substring(6, 8));
        int tOut = Integer.valueOf(out.substring(0, 2)) * 3600 + Integer.valueOf(out.substring(3, 5)) * 60 + Integer.valueOf(out.substring(6, 8));
        return tOut - tIn;
    }

    public String stringOfTime(int time) {
        int h = time / 3600;
        int m = (time % 3600) / 60;
        int s = time % 60;
        String hour = String.valueOf(h);
        if (hour.length() < 2) {
            hour = "0" + hour;
        }
        String minute = String.valueOf(m);
        if (minute.length() < 2) {
            minute = "0" + minute;
        }
        String second = String.valueOf(s);
        if (second.length() < 2) {
            second = "0" + second;
        }
        return hour + ":" + minute + ":" + second;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + time + " " + timePlus + " " + timeRank + " " + rank;
    }
}

public class J05055_XepHangVanDongVien1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<VanDongVien> a = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();
        TreeMap<Integer, Integer> ranking = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            String id = "";
            if (i < 10) {
                id = "VDV0" + i;
            } else {
                id = "VDV" + i;
            }
            a.add(new VanDongVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (VanDongVien vdv : a) {
            time.add(vdv.getTimeRank());
        }
        Collections.sort(time);
        ranking.put(time.get(0), 1);
        int cnt = 1;
        for (int i = 1; i < time.size(); i++) {
            if (Objects.equals(time.get(i), time.get(i - 1))) {
                ++cnt;
            } else {
                ranking.put(time.get(i), ranking.get(time.get(i - 1)) + cnt);
                cnt = 1;
            }
        }
        for (VanDongVien vdv : a) {
            vdv.setRank(ranking.get(vdv.getTimeRank()));
        }
        for (VanDongVien vdv : a) {
            System.out.println(vdv);
        }
    }
}
