package CodeChef;

import java.util.*;
import java.util.Scanner;

public class SecondMaxOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = Integer.MIN_VALUE;
            if ((a > b && a < c) || (a > c && a < b)) {
                max = a;
            } else if ((b > a && b < c) || (b > c && b < a)) {
                max = b;
            } else {
                max = c;
            }
            System.out.println(max);
        }
    }

}
