package dsa_basic;

import java.util.*;

public class LCM_HCF {

    public static void main(String[] args){


        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int od1 = n1;
        int od2 = n2;

        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;

        int lcm = (od1*od2)/gcd;
        System.out.println(lcm);
        System.out.println(gcd);
    }


}
