package access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Pratik");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(59);
        list.add(52);
        list.add(58);

        for (int ss:list
             ) {
            System.out.println(ss);
        }

    }
}
