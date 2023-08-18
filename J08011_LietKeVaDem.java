import java.util.*;

public class J08011_LietKeVaDem {

    public static boolean check(int k) {
        String s = String.valueOf(k);
        char[] c = s.toCharArray();
        int n = c.length;
        for (int i = 0; i < n - 1; i++) {
            if (c[i] > c[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        LinkedHashSet<Integer> ts = new LinkedHashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        while (sc.hasNextInt()) {
            int k = sc.nextInt();
            if (check(k)) {
                if (tm.containsKey(k)) {
                    tm.put(k, tm.get(k) + 1);
                } else {
                    tm.put(k, 1);
                }
                ts.add(k);
            }
        }

        for (Integer x : ts) {
            a.add(x);
        }
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
                return tm.get(t1) - tm.get(t);
            }
        });

        for (Integer x : a) {
            System.out.println(x + " " + tm.get(x));
        }
    }
}
