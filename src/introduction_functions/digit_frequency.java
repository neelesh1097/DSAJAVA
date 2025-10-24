package introduction_functions;

import java.util.*;

public class digit_frequency {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] counter = new int[10];

        while( n != 0){
            int digit = n%10;

            n=n/10;
            counter[digit]++;
            System.out.println(digit);

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " appears " + counter[i] + " times.");
        }

        scn.close();



    }
}
