import java.io.*;
import java.math.*;
import java.util.*;

public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> ab = (ArrayList<String>)ois.readObject();
        TreeSet <String> ts1 = new TreeSet<>();
        LinkedHashSet <String> ts2 = new LinkedHashSet<>();
        for(String w:ab) { StringTokenizer ss = new  StringTokenizer(w.toLowerCase()); while(ss.hasMoreTokens()) ts1.add(ss.nextToken());}
        while(sc.hasNext()) ts2.add(sc.next().toLowerCase());
        for(String word:ts2)
            if(ts1.contains(word))
                System.out.println(word);
    }
}