import java.util.*;
import java.lang.*;
import java.io.*;

class Assignment1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        // list.add(2);
        // list.add(8);
        // list.add(1);

        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
        sc.close();
    }
}
