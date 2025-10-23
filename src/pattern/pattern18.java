package pattern;
import java.util.Scanner;

public class pattern18 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // should be odd for proper Swastik

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                // Top half
                if (i == 1 && j >= n / 2 + 1)
                    System.out.print("*");
                else if (j == 1 && i <= n / 2 + 1)
                    System.out.print("*");

                    // Center line (horizontal & vertical)
                else if (i == n / 2 + 1 || j == n / 2 + 1)
                    System.out.print("*");

                    // Bottom half
                else if (i == n && j <= n / 2 + 1)
                    System.out.print("*");
                else if (j == n && i >= n / 2 + 1)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        scn.close();
    }
}
