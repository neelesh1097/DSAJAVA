package dsa_basic;

import java.util.Scanner;

public class conditionals {

    public static void main(String[] args){


        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if (marks >= 90) {
            System.out.println("excellent");
        } else if (marks >= 80) {
            System.out.println("very good");
        } else if (marks >= 70) {
            System.out.println("good");
        } else if (marks >= 60) {
            System.out.println("need more improvement");
        } else if (marks >= 50) {
            System.out.println("need improvement");
        } else if (marks >= 40) {
            System.out.println("just passed");
        } else {
            System.out.println("failed");
        }
    }
}
