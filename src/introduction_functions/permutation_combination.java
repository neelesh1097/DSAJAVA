package introduction_functions;
import java.util.*;

public class permutation_combination {

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        int i=  scn.nextInt();
        int j = scn.nextInt();
        

        int nfact = fact(i);
        int nrfact = fact(i - j);
        int permutation = nfact / nrfact;


        System.out.println("nPr = " + permutation);

        scn.close();
        
        
        
    }


    public static int fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}
