import java.util.*;
public class J02011_SapXepChon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n;i++)
            a[i]=sc.nextInt();
        toiyeuptit(a);
    }
    public static void toiyeuptit(int []a)
    {
    int n = a.length;
    int b = 1;
    for(int i = 0; i < n-1; i++){
        int min = a[i], id = i;
        for(int j = i+1; j < n;j++)
            if(a[j]<min)
            {
                min = a[j];
                id = j;
            }
        if(id!=i)
        {
            int tmp = a[id];
            a[id]=a[i];
            a[i]=tmp;
        }
            System.out.print("Buoc "+(b++)+": ");
            for(int k = 0; k<n;k++)
                System.out.print(a[k]+" ");
            System.out.println("");
        }
    }
    }

