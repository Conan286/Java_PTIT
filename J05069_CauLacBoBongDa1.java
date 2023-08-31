import java.util.*;
import java.math.*;
import java.io.*;
class Club{
private String id,name;
private long costOfTicket;

public Club(String id,String name,long cost)
{
this.id = id;
this.name = name;
this.costOfTicket = cost;
}

public long getCost()
{
return this.costOfTicket;
}

public String getId()
{
return this.id;
}

public String getName()
{
return this.name;
}

}
class Match{
private String  idMatch,idClub,nameClub;
private long fan,money;
public Match(String s)
{
this.idMatch = s.split(" ")[0];
this.idClub = this.idMatch.substring(1,3);
this.fan = (long)Integer.valueOf(s.split(" ")[1]);
}

public String getId()
{
return this.idClub;
}

public void setMoney(long giaVe)
{
this.money = this.fan*giaVe;
}

public void setName(String name){
this.nameClub = name;
}

@Override
public String toString()
{
return this.idMatch+" "+this.nameClub+" "+this.money;
}
}
public class J05069_CauLacBoBongDa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<Club> a = new ArrayList<>();
        ArrayList<Match> b = new ArrayList<>();
        for(int i = 1;i<=n;i++)
        {
        sc.nextLine();
        a.add(new Club(sc.nextLine(),sc.nextLine(),sc.nextLong()));
        }
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 1;i<=m;i++)
        {
        b.add(new Match(sc.nextLine()));
        }
        for(Match match:b)
        {
        for(Club club:a)
        {
        if(club.getId().equals(match.getId()))
        {
        match.setMoney(club.getCost());
        match.setName(club.getName());
        break;
        }
        }
        }
        for(Match match:b)
            System.out.println(match);
    }
}
