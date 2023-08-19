import java.util.*;
import java.io.*;
import java.math.*;
class pos{
int x;
int y;
int v;
public pos(int x,int y,int v)
{
this.x = x;
this.y = y;
this.v = v;
}
}

public class J08029_QuanMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String st = sc.next();
        String en = sc.next();
        System.out.println(ptit(st,en));
        }
    }
    public static int []dx = {1,2,2,1,-1,-2,-2,-1};
    public static int []dy ={2,1,-1,-2,-2,-1,1,2};
    public static int ptit(String st,String en)
    {
     if(st.equals(en)) return 0;
     int cnt = 0;
     int x1 = (int)st.charAt(0) - 96;
     int x2 = (int)en.charAt(0) - 96;
     int y1 = (int)(st.charAt(1)-'0');
     int y2 = (int)(en.charAt(1)-'0');
     
     int [][]vs = new int[9][9];
     for(int i = 0;i<9;i++)
         for(int j = 0;j<9;j++)
             vs[i][j]=0;
     Deque<pos>dq=new ArrayDeque<>();     
     dq.push(new pos(x1,y1,cnt));
     vs[x1][y1]=1;
     while(true)
     {
     pos top = dq.peekLast();
     dq.pollLast();
     cnt = top.v;
     int tx = top.x;
     int ty = top.y;
     if(tx==x2 && ty==y2) break;
     for(int i = 0; i<8;i++)
     {
     int t1 = tx+dx[i];
     int t2 = ty+dy[i];
     if( t1>=1 && t1<=8 && t2>=1 && t2<=8 && vs[t1][t2]==0)
     {
     vs[t1][t2]=1;
     dq.push(new pos(t1,t2,cnt+1));
     }
     }
     }
     return cnt;
    }
}
