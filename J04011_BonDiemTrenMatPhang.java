import java.io.*;
import java.math.*;
import java.util.*;
class Point3D {
public int x,y,z;
public Point3D(int x,int y,int z)
{
this.x = x;
this.y = y;
this.z = z;
}
public static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4)
{
int x1 = p2.x - p1.x;
int y1 = p2.y - p1.y;
int z1 = p2.z - p1.z;
int x2 = p3.x - p1.x;
int y2 = p3.y - p1.y;
int z2 = p3.z - p1.z;
//x1 y1 z1
//x2 y2 z2
//ptx = z2*y1 - z1*y2;
//pty = x2*z1 - x1*z2;
//ptz = y2*x1 - y1*x2;
//di qua A(p1.x,p1.y,p1.z) co vector phap tuyen(ptx,pty,ptz)
//=> pt: ptx*(x-p1.x)+pty*(y-p1.y)+ptz*(z-p1.z) = 0
int ptx = z2*y1 - z1*y2;
int pty = x2*z1 - x1*z2;
int ptz = y2*x1 - y1*x2;
return (ptx*(p4.x - p1.x) + pty*(p4.y - p1.y) + ptz*(p4.z - p1.z))==0;        
}
}
public class J04011_BonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main4133384(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main4234125(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    
}
