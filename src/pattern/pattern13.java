package pattern;
import java.util.Scanner;


public class pattern13 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        int n = scn.nextInt();

        for(int i=1; i<=n; i++){

            System.out.println(x*i);

        }
    }


}
