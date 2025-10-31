package Array;
import java.util.*;


public class bar_chart {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int max =arr[0];

        for(int i=0; i<n; i++){
            if(arr[i]  > max){
                max = arr[i];
            }
        }

        for (int level = max; level >= 1; level--) {
            for (int i = 0; i < n; i++) {
                if (arr[i] >= level) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}
