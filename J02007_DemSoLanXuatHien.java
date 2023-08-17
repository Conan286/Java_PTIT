import java.util.*;
public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int k = t;
        while(t-->0)
        {
        int n = sc.nextInt();
        System.out.println("Test "+(k-t)+":");
        int []a = new int [n];
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int i = 0 ; i < n ; i++)
        {
        a[i] = sc.nextInt();
        if(mp.containsKey(a[i]))
            mp.put(a[i], mp.get(a[i])+1);
        else 
            mp.put(a[i], 1);
        }
        for(int i = 0 ; i < n ; i++)
        {
            if(mp.get(a[i])>0)
            {
                System.out.println(a[i]+" xuat hien "+mp.get(a[i])+" lan");
                mp.put(a[i], 0);
            }
        }
        }
    }
}
