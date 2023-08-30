
import java.util.*;

class Person {

    public String name, birth;
    public int d, m, y;

    public Person(String s) {
        this.name = s.split(" ")[0];
        this.birth = s.split(" ")[1];
        this.d = Integer.valueOf(birth.substring(0, 2));
        this.m = Integer.valueOf(birth.substring(3, 5));
        this.y = Integer.valueOf(birth.substring(6, 10));
    }

    @Override
    public String toString() {
        return name;
    }
}

public class J05032_TreNhatGiaNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Person(sc.nextLine()));
        }

        Collections.sort(a, new Comparator<Person>() {
            @Override
            public int compare(Person t, Person t1) {
                if (t.y != t1.y) {
                    return t.y > t1.y ? 1 : -1;
                } else if (t.m != t1.m) {
                    return t.m > t1.m ? 1 : -1;
                }
                return t.d > t1.d ? 1 : -1;
            }
        });
        System.out.println(a.get(n - 1));
        System.out.println(a.get(0));
    }
}