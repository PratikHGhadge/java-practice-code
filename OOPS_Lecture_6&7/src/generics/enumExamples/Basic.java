package generics.enumExamples;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sn = num;
        int r, fact, sum = 0;
        while (num != 0) {
            fact = 1;
            r = num % 10;
            for (int i = r; i >= 1; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sn == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
