package pattern;
import java.util.*;

public class pattern17 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star =n;
        int space=0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" - ");

            }
            for(int j=1; j<=star; j++){
                System.out.print(" * ");

            }

            for(int j=1; j<=space; j++){
                System.out.print(" - ");

            }


            if(i <= n / 2){
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }
            System.out.println();


        }
    }

}
