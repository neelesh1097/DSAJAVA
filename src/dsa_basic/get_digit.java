package dsa_basic;
import java.util.*;

public class get_digit {

    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);

       int n = scn.nextInt();
       int temp =n;

       int nod =0;
       while(temp > 0){
           temp =temp/10;
           nod++;

       }
//        System.out.println(nod);
int div =(int)Math.pow(10 ,nod-1);
       while(n > 0){
           int q = n/div;
          System.out.println(q);

          n=n%div;
          div=div/10;

       }



    }
}
