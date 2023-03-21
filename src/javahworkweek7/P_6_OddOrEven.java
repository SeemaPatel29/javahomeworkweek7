package javahworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class P_6_OddOrEven {
    public static void main(String[] args) {
        oddeven();

    }

    public static void oddeven() {
        int n;
        System.out.println("Input any number:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.close();
        //used if condition for even or odd
        if (n % 2 == 0){
            System.out.println(" Number " + n + " is even number");
                    }else {
            System.out.println("Number " + n + " is odd number");
        }

    }
}
