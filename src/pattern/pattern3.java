package pattern;


import java.util.*;

public class pattern3 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int star = 1;
        int space =4;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=space; j++){

                System.out.print(" - ");
            }
            for(int j=1; j<=star; j++){

                System.out.print(" * ");
            }

            System.out.println();
            star++;
            space--;

        }


    }
}
