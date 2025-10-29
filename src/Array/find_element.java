package Array;
import java.util.*;

public class find_element {

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int val = scn.nextInt();

        int arr[] = new int[n];


        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

      int d =  getElement(arr , val);

        System.out.println(d);


    }

    public static int getElement(int arr[] , int val) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }

        }
        return -1;

    }


}
