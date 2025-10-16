package dsa_basic;

import java.util.*;

public class pythagorous {

    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;

        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        boolean flag = false;

        // Check which one is max and apply Pythagoras theorem
        if (max == a) {
            flag = (a * a == b * b + c * c);
        } else if (max == b) {
            flag = (b * b == a * a + c * c);
        } else {
            flag = (c * c == a * a + b * b);
        }

        if (flag) {
            System.out.println("Pythagorean triplet");
        } else {
            System.out.println("Not a Pythagorean triplet");
        }

        scn.close();


    }
}
