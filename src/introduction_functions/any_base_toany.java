package introduction_functions;

import java.util.*;
public class any_base_toany {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        scn.close();
        int b2b = any_to_any_base(n, b1, b2);
        System.out.print(b2b);

    }

    public static int any_to_any_base(int n, int b1, int b2) {
        int bes = base_to_decimal(n, b1);
        int d = decimaltobase(bes , b2);
        return d;

    }


    public static int base_to_decimal(int n, int b1) {
        int rv = 0;

        int p = 1;
        while (n != 0) {
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p = p * b1;
        }
           return rv;
    }


    public static int decimaltobase(int n , int b2){

        int rv =0;

        int p=1;

        while(n != 0){
            int dig =n % b2;

            n =n/b2;

            rv += dig * p;
            p =p * 10;


        }

        return rv;
    }
}
