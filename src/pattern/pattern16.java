package pattern;
import java.util.*;

public class pattern16 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = 1;
        int space = n / 2;


        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= space; j++) {

                if(i == (n/2 +1)){

                    System.out.print(" * ");
                }
                else{
                    System.out.print(" - ");
                }

            }

            // print numbers

            for (int j = 1; j <= star; j++) {
                System.out.print(" * ");
            }



            System.out.println();

            // update counts
            if (i <= n / 2) {
               star++;


            } else {
               star--;

            }
        }

        scn.close();


    }
}
