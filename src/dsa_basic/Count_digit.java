package dsa_basic;

public class Count_digit {

    static int count = 1234;
    public static void main(String[] args){

        int counter =0;

       while(count >0 ){
           count = count/10;
           counter++;

       }
System.out.println(counter);

    }
}
