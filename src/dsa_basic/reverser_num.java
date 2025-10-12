package dsa_basic;
import java.util.*;


public class reverser_num {

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int k = scn.nextInt();

        int nod =0;

        int temp=n;

        while(temp>0){
            temp = temp/10;
            nod++;
        }
        System.out.println(nod);
int div=1;
int mul=1;
        for(int i=1; i<=nod; i++){
            if(i <= k){
                div = div *10;
            }
              else{
                  mul = mul*10;
            }


        }

        int q = n/div;
        int r = n%div;

        int rot = r * mul + q;
        System.out.println(rot);


    }



}
