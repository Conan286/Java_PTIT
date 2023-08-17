import java.util.*;
import java.io.*;
import java.math.*;
import java.io.FileNotFoundException;

public class J07001_DocFileVanBan {
     public static void main(String[] args) throws FileNotFoundException   {
         File read = new File("DATA.in");
        Scanner sc = new Scanner(read);
        while(sc.hasNextLine())
        {
        String data = sc.nextLine();
            System.out.println(data);
        }
     }
}