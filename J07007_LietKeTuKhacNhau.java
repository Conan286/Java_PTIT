import java.io.*;
import java.math.*;
import java.util.*;

class WordSet{
public TreeSet<String> listWord = new TreeSet<>();
public WordSet(String file) throws FileNotFoundException
{
Scanner sc = new Scanner(new File(file));
while(sc.hasNext())
    listWord.add(sc.next().toLowerCase());
}
@Override
public String toString()
{
String ans = "";
for(String w:listWord)
    ans+=w+"\n";
return ans;
}
}

public class J07007_LietKeTuKhacNhau {
   public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
