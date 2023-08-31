//B21DCCN441

import java.util.*;
import java.math.*;
import java.io.*;

class FootBallClub {

    private String id, name;
    private long costOfTicket;

    public FootBallClub(String id, String name, long cost) {
        this.id = id;
        this.name = name;
        this.costOfTicket = cost;
    }

    public long getCost() {
        return this.costOfTicket;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

class FootBallMatch {

    private String idFootBallMatch, idFootBallClub, nameFootBallClub;
    private long fan, money;

    public FootBallMatch(String s) {
        this.idFootBallMatch = s.split(" ")[0];
        this.idFootBallClub = this.idFootBallMatch.substring(1, 3);
        this.fan = (long) Integer.valueOf(s.split(" ")[1]);
    }

    public String getId() {
        return this.idFootBallClub;
    }

    public void setMoney(long giaVe) {
        this.money = this.fan * giaVe;
    }

    public void setName(String name) {
        this.nameFootBallClub = name;
    }

    public long getMoney() {
        return this.money;
    }

    @Override
    public String toString() {
        return this.idFootBallMatch + " " + this.nameFootBallClub + " " + this.money;
    }
}

public class J05070_CauLacBoBongDa2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<FootBallClub> a = new ArrayList<>();
        ArrayList<FootBallMatch> b = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new FootBallClub(sc.nextLine(), sc.nextLine(), sc.nextLong()));
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            b.add(new FootBallMatch(sc.nextLine()));
        }
        for (FootBallMatch match : b) {
            for (FootBallClub club : a) {
                if (club.getId().equals(match.getId())) {
                    match.setMoney(club.getCost());
                    match.setName(club.getName());
                    break;
                }
            }
        }
        Collections.sort(b, new Comparator<FootBallMatch>() {
            @Override
            public int compare(FootBallMatch t, FootBallMatch t1) {
                return t.getMoney() > t1.getMoney() ? -1 : 1;
            }
        });
        for (FootBallMatch match : b) {
            System.out.println(match);
        }
    }
}
