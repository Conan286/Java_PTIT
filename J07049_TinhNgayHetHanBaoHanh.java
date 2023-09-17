//B21DCCN441
import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.*;
import java.text.*;
import java.math.*;

class Product {

    private String idProduct, nameProduct;
    private int costProduct, warrantyTime;

    public Product(String id, String name, int cost, int warranty) {
        this.idProduct = id;
        this.nameProduct = name;
        this.costProduct = cost;
        this.warrantyTime = warranty;
    }

    public String getId() {
        return this.idProduct;
    }

    public String getName() {
        return this.nameProduct;
    }

    public int getCost() {
        return this.costProduct;
    }

    public int getWarrantyTime() {
        return this.warrantyTime;
    }
}

class Client {

    private String idClient, nameClient, addressClient, idOfProduct, timeBuy;
    private int numberOfProduct;

    public Client(int i, String name, String address, String idpro, int numberOfProduct, String timeBuy) {
        this.idClient = "KH" + i;
        if (i < 10) {
            this.idClient = "KH0" + i;
        }
        this.nameClient = name;
        this.addressClient = address;
        this.idOfProduct = idpro;
        this.timeBuy = timeBuy;
        this.numberOfProduct = numberOfProduct;
    }

    public String getIdClient() {
        return this.idClient;
    }

    public String getNameClient() {
        return this.nameClient;
    }

    public String getAddressClient() {
        return this.addressClient;
    }

    public String GetIdOfProduct() {
        return this.idOfProduct;
    }

    public String GetTimeBuy() {
        return this.timeBuy;
    }

    public int getNumOfProduct() {
        return this.numberOfProduct;
    }
}

class Bill {

    private Client cli;
    private Product pro;
    private int Fee;
    private String EndTime;

    public Bill(Client c, Product p) {
        this.cli = c;
        this.pro = p;
        this.Fee = this.pro.getCost() * this.cli.getNumOfProduct();
        this.EndTime = timeEnd(this.cli.GetTimeBuy(), this.pro.getWarrantyTime());
    }

    public String timeEnd(String st, int d) {
        int fn = Integer.valueOf(st.substring(3, 5)) + d;
        int y = Integer.valueOf(st.substring(6, 10)) + ((fn % 12 == 0) ? ((int) (fn / 12) - 1) : (fn / 12));
        int m = (fn % 12 == 0 ? 12 : fn % 12);
        String ans = st.substring(0, 3);
        if (m < 10) {
            ans += "0";
        }
        return ans + m + "/" + y;
    }

    public int EndDayOfWarranty() {
        return Integer.valueOf(this.EndTime.substring(0, 2));
    }

    public int EndMonthOfWarranty() {
        return Integer.valueOf(this.EndTime.substring(3, 5));
    }

    public int EndYearOfWarranty() {
        return Integer.valueOf(this.EndTime.substring(6, 10));
    }

    public String idCustomer() {
        return this.cli.getIdClient();
    }

    @Override
    public String toString() {
        return this.cli.getIdClient() + " " + this.cli.getNameClient() + " " + this.cli.getAddressClient() + " " + this.cli.GetIdOfProduct() + " " + this.Fee + " " + this.EndTime;
    }
}

public class J07049_TinhNgayHetHanBaoHanh {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = sc.nextInt();
        ArrayList<Bill> ab = new ArrayList<>();
        TreeMap<String, Product> tsp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String idProDuct = sc.nextLine();
            Product tmp = new Product(idProDuct, sc.nextLine(), sc.nextInt(), sc.nextInt());
            tsp.put(idProDuct, tmp);
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= m; i++) {

            String name = sc.nextLine();
            String address = sc.nextLine();
            String idpro = sc.nextLine();
            int numOfpro = sc.nextInt();
            sc.nextLine();
            String date = sc.nextLine();
            Client cus = new Client(i, name, address, idpro, numOfpro, date);
            ab.add(new Bill(cus, tsp.get(cus.GetIdOfProduct())));
        }
        Collections.sort(ab, new Comparator<Bill>() {
            @Override
            public int compare(Bill t, Bill t1) {
                if (t.EndYearOfWarranty() != t1.EndYearOfWarranty()) {
                    return t.EndYearOfWarranty() > t1.EndYearOfWarranty() ? 1 : -1;
                } else if (t.EndMonthOfWarranty() != t1.EndMonthOfWarranty()) {
                    return t.EndMonthOfWarranty() > t1.EndMonthOfWarranty() ? 1 : -1;
                } else if (t.EndDayOfWarranty() != t1.EndDayOfWarranty()) {
                    return t.EndDayOfWarranty() > t1.EndDayOfWarranty() ? 1 : -1;
                }
                return t.idCustomer().compareTo(t1.idCustomer());
            }
        });
        for (Bill b : ab) {
            System.out.println(b);
        }
    }
}
