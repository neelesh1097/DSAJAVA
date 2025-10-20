package pattern;
import java.util.Scanner;

public class pattern14 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = 1;
        int space = n / 2;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // print numbers
            int snum = num;
            for (int j = 1; j <= star; j++) {
                System.out.print(snum);
                if(j <= star/2){
                    snum++;
                }
                else{
                    snum--;
                }

            }

            System.out.println();

            // update counts
            if (i <= n / 2) {
                star += 2;
                space--;
                num++;
            } else {
                star -= 2;
                space++;
                num--;
            }
        }

        scn.close();

    }
}
