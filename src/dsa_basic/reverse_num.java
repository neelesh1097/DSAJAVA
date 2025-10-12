package dsa_basic;
import java.util.*; //import java utilities


public class reverse_num {

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();

    int nod =0;
    int temp =n;
    while(temp>0){
        temp= temp/10;
        nod++;
    }
    System.out.print(nod);

    int div =(int)Math.pow(10 , nod-1);
int p=0;

    while(n>0){
        int q = n % 10;
        n = n/10;


        p += q*div;
        div=div/10;

    }
    System.out.print(p);

}

}
