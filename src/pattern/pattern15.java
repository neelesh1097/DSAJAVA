package pattern;
import java.util.*;

public class pattern15 {
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = 1;
        int space = 2 * n - 3;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print(val );
                val++;
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("-");
            }

            if (i == n) {
                star--;
                val--;
            }

            for (int j = 1; j <= star; j++) {
                val--;
                System.out.print(val );
            }

            star++;
            space -= 2;
            System.out.println();
        }


    }
}
