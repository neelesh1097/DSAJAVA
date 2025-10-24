package introduction_functions;
import java.util.*;

public class decimal_to_base {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int dig = scn.nextInt();

        int num = n;


        int counter = 0;


        while( n != 0){
           System.out.println(n= n/dig);
           counter++;


        }
        System.out.println(counter);


        int rv =0;

        while(num != 0){

            int rem = num % dig;
            rv += rem * Math.pow(10, counter - 1); // place value
            num = num / dig;
            counter--;


        }
        System.out.println(rv);


    }
}
