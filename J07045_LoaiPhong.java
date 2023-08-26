import java.util.*;
import java.io.*;
import java.math.*;

class LoaiPhong implements Comparable<LoaiPhong> {

    public String lp, tlp;

    public LoaiPhong(String a) {
        this.lp = a;
        this.tlp = a.split(" ")[1];
    }

    @Override
    public int compareTo(LoaiPhong b) {
        return this.tlp.compareTo(b.tlp);
    }

    @Override
    public String toString() {
        return lp;
    }
}

public class J07045_LoaiPhong {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}
