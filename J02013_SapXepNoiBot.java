import java.util.*;
public class J02013_SapXepNoiBot {
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
    for(int i = 0; i< n ;i++)
    {
      int ch = 0;
      for(int j=0;j<n-1;j++)
          if(a[j]>a[j+1])
          {
          int tmp = a[j+1];
          a[j+1]=a[j];
          a[j] = tmp;
          ch=1;
          }
      if(ch==1){
            System.out.print("Buoc "+(b++)+": ");
            for(int k = 0; k<n;k++)
                System.out.print(a[k]+" ");
            System.out.println("");
      }
    }
    }
}
